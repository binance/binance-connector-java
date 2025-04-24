package com.binance.connector.client.common.sign;

import com.binance.connector.client.common.ApiException;
import java.io.IOException;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.crypto.signers.RSADigestSigner;
import org.bouncycastle.crypto.util.PrivateKeyFactory;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;

/** ED25519 or RSA private keys */
public class PrivateKey implements SignatureGenerator {
    protected Signer signer;

    public void init(byte[] keyContent) {
        String privateKey = removeHeaderFooter(new String(keyContent));
        byte[] decode = Base64.getDecoder().decode(privateKey);
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(decode);
        PrivateKeyInfo instance = PrivateKeyInfo.getInstance(pkcs8EncodedKeySpec.getEncoded());
        ASN1ObjectIdentifier algorithmIdentifier = instance.getPrivateKeyAlgorithm().getAlgorithm();
        AsymmetricKeyParameter key = null;
        try {
            key = PrivateKeyFactory.createKey(instance);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.signer = getSigner(algorithmIdentifier, key);
    }

    /**
     * Initialize Ed25519 private key
     *
     * @param keyContent
     * @param password
     * @throws ApiException
     */
    public void init(byte[] keyContent, String password) throws ApiException {
        if (password == null) {
            init(keyContent);
            return;
        }

        String s = new String(keyContent);

        s = removeEncryptedHeaderFooter(s);

        try {
            Security.addProvider(new BouncyCastleProvider());
            PKCS8EncryptedPrivateKeyInfo pkcs8EncryptedPrivateKeyInfo =
                    new PKCS8EncryptedPrivateKeyInfo(Base64.getDecoder().decode(s.getBytes()));
            // Decrypt encrypted key
            JcaPEMKeyConverter jcaPEMKeyConverter = new JcaPEMKeyConverter();
            InputDecryptorProvider inputDecryptorProvider =
                    new JceOpenSSLPKCS8DecryptorProviderBuilder().build(password.toCharArray());
            PrivateKeyInfo privateKeyInfo =
                    pkcs8EncryptedPrivateKeyInfo.decryptPrivateKeyInfo(inputDecryptorProvider);

            java.security.PrivateKey privateKey = jcaPEMKeyConverter.getPrivateKey(privateKeyInfo);

            PrivateKeyInfo instance = PrivateKeyInfo.getInstance(privateKey.getEncoded());
            AsymmetricKeyParameter key = PrivateKeyFactory.createKey(instance);
            ASN1ObjectIdentifier algorithmIdentifier =
                    instance.getPrivateKeyAlgorithm().getAlgorithm();

            this.signer = getSigner(algorithmIdentifier, key);
        } catch (Exception e) {
            throw new ApiException(e);
        }
    }

    public byte[] sign(String input) throws CryptoException {
        return sign(input.getBytes());
    }

    public byte[] sign(byte[] input) throws CryptoException {
        signer.update(input, 0, input.length);
        byte[] generateSignature = signer.generateSignature();
        return Base64.getEncoder().encode(generateSignature);
    }

    public String signAsString(String input) throws CryptoException {
        return signAsString(input.getBytes());
    }

    public String signAsString(byte[] input) throws CryptoException {
        return new String(sign(input));
    }

    protected String removeEncryptedHeaderFooter(String input) {
        return input.replace(System.lineSeparator(), "")
                .replace("-----BEGIN ENCRYPTED PRIVATE KEY-----", "")
                .replace("-----END ENCRYPTED PRIVATE KEY-----", "");
    }

    protected String removeHeaderFooter(String input) {
        return input.replace(System.lineSeparator(), "")
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "");
    }

    private Signer getSigner(ASN1ObjectIdentifier algorithmIdentifier, AsymmetricKeyParameter key) {
        Signer signer;
        // is ED25519 algorithm
        if (EdECObjectIdentifiers.id_Ed25519.equals(algorithmIdentifier)) {
            signer = new Ed25519Signer();
            signer.init(true, key);
            return signer;
        }

        // is RSA algorithm
        if (PKCSObjectIdentifiers.rsaEncryption.equals(algorithmIdentifier)) {
            signer = new RSADigestSigner(new SHA256Digest());
            signer.init(true, key);
            return signer;
        }

        return null;
    }
}
