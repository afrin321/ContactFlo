package com.contactflow.EmailService.Service;

import com.contactflow.EmailService.Entity.ApiKey;
import com.contactflow.EmailService.Repository.ApiKeyRepository;
import com.contactflow.EmailService.Utils.KeyGeneration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiKeyService {

    @Autowired
    private ApiKeyRepository apiKeyRepository;



    public Boolean findRegisteredEmail(String email) {
        List<ApiKey> apiKeyList = apiKeyRepository.findByEmailCustomQuery(email);

        return !apiKeyList.isEmpty();
    }

    public String findRegisteredKey(String apiKey) {
        List<String> emailList = apiKeyRepository.findByApiKeyCustomQuery(apiKey);
        if (emailList.isEmpty()) {
            return null;
        }
        return emailList.get(0);
    }

    public String generateAndSaveApiKey(String email) {
        ApiKey apiKeyEntity = new ApiKey();
        apiKeyEntity.setEmail(email);
        String newKey = KeyGeneration.generateApiKey(email);
        apiKeyEntity.setApiKey(newKey);
        ApiKey newEntity = apiKeyRepository.save(apiKeyEntity);
        return newEntity.getApiKey();
    }
}
