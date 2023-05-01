package com.binance.connector.client.utils.signaturegenerator;

import java.io.File;
import java.io.IOException;
import java.security.Signature;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import com.binance.connector.client.utils.ParameterChecker;

public final class RsaSignatureGenerator implements SignatureGenerator {

    private static final String RSA_SHA256 = "SHA256withRSA";
    private static final String RSA = "RSA";
    private RSAPrivateKey privateKey;

    public RsaSignatureGenerator(String privateKey) {
        this(privateKey, null);
    }

    public RsaSignatureGenerator(String privateKey, String password) {
        ParameterChecker.checkParameterType(privateKey, String.class, "privateKey");
        
        try {
            String privateKeyPem = privateKey;
            if (new File(privateKey).exists()) {
                privateKeyPem = new String(Files.readAllBytes(Paths.get(privateKey)));
            }
            this.privateKey = this.parsePrivateKey(privateKeyPem, password);
        } catch (IOException e) {
            throw new RuntimeException("Unable to find/read private key at given file path", e);
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse RSA private key", e);
        }
    }

    public String getSignature(String data) {
        try {
            Signature privateSignature = Signature.getInstance(RSA_SHA256);
            privateSignature.initSign(this.privateKey);
            privateSignature.update(data.getBytes());
        
            byte[] signature = privateSignature.sign();
        
            return Base64.getEncoder().encodeToString(signature);
        } catch (Exception e) {
            throw new RuntimeException("Failed to calculate rsa-sha256", e);
        }
    }

    private RSAPrivateKey parsePrivateKey(String privateKeyPem, String password) throws Exception {
        // Private Key in PKCS#8 standard
        String parsedPem = privateKeyPem.replace("\n", "").trim();
        if (password != null) {
            parsedPem = parsedPem
            .replace("-----BEGIN ENCRYPTED PRIVATE KEY-----", "")
            .replace("-----END ENCRYPTED PRIVATE KEY-----", "");
        } else {
            parsedPem = parsedPem
            .replace("-----BEGIN PRIVATE KEY-----", "")
            .replace("-----END PRIVATE KEY-----", "");
        }
        byte[] encoded = Base64.getDecoder().decode(parsedPem); //illegal character
        PKCS8EncodedKeySpec encodedKeySpec;
        if (password != null) {
            EncryptedPrivateKeyInfo pkInfo = new EncryptedPrivateKeyInfo(encoded);
            PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray());
            SecretKeyFactory pbeKeyFactory = SecretKeyFactory.getInstance(pkInfo.getAlgName());
            encodedKeySpec = pkInfo.getKeySpec(pbeKeyFactory.generateSecret(keySpec));
        } else {
            encodedKeySpec = new PKCS8EncodedKeySpec(encoded);
        }

        KeyFactory kf = KeyFactory.getInstance(RSA);
        return (RSAPrivateKey) kf.generatePrivate(encodedKeySpec);
    }
}
