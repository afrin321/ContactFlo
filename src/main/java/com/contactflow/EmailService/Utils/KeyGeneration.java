package com.contactflow.EmailService.Utils;

import org.springframework.util.DigestUtils;

import java.security.SecureRandom;
import java.util.Base64;

public final class KeyGeneration {

    public static String generateApiKey(String email) {
        String randomComponent = generateRandomApiKey(16); // Generate a random string
        String combinedInput = email + randomComponent;
        return DigestUtils.md5DigestAsHex(combinedInput.getBytes());
    }

    public static String generateRandomApiKey(int length) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[length];
        secureRandom.nextBytes(randomBytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(randomBytes);
    }
}
