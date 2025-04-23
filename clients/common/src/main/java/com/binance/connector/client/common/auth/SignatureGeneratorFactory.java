package com.binance.connector.client.common.auth;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.sign.HmacSignatureGenerator;
import com.binance.connector.client.common.sign.PrivateKey;
import com.binance.connector.client.common.sign.SignatureGenerator;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SignatureGeneratorFactory {
    public SignatureGenerator getSignatureGenerator(SignatureConfiguration configuration) {
        String privateKeyConfig = configuration.getPrivateKey();
        if (privateKeyConfig != null) {
            PrivateKey privateKey = new PrivateKey();
            byte[] privateKeyContent;
            // check if it is the private key content, or path to private key
            if (hasPrivateKeyHeader(privateKeyConfig)) {
                privateKeyContent = privateKeyConfig.getBytes();
            } else {
                Path path = Paths.get(privateKeyConfig);
                try {
                    privateKeyContent = Files.readAllBytes(path);
                } catch (IOException e) {
                    throw new ApiException(e);
                }
            }

            if (configuration.getPrivateKeyPass() != null) {
                privateKey.init(privateKeyContent, configuration.getPrivateKeyPass());
            } else {
                privateKey.init(privateKeyContent);
            }
            return privateKey;
        }

        if (configuration.getSecretKey() != null) {
            return new HmacSignatureGenerator(configuration.getSecretKey());
        }

        return null;
    }

    private Boolean hasPrivateKeyHeader(String input) {
        if (input.startsWith("-----BEGIN PRIVATE KEY-----")) {
            return true;
        }

        return input.startsWith("-----BEGIN ENCRYPTED PRIVATE KEY-----");
    }
}
