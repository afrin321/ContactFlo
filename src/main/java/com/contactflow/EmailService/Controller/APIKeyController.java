package com.contactflow.EmailService.Controller;

import com.contactflow.EmailService.Model.KeyGenerationRequest;
import com.contactflow.EmailService.Service.ApiKeyService;
import com.contactflow.EmailService.Service.EmailService;
import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/keygen")
public class APIKeyController {
    @Autowired
    private ApiKeyService apiKeyService;
    @Autowired
    private EmailService emailService;
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @PostMapping("/newkey")
    public ResponseEntity<String> generateNewKey(@RequestBody KeyGenerationRequest emailRequest) throws EmailException {

        Boolean isRegistered = apiKeyService.findRegisteredEmail(emailRequest.getEmail());

        if (!isRegistered) {
            String apiKey = apiKeyService.generateAndSaveApiKey(emailRequest.getEmail());
            emailService.sendEmail(emailRequest.getEmail(), "ContactFlo - SECRET KEY", apiKey);
            return new ResponseEntity<>("API Key sent to your E-mail", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("API Key already Generated", HttpStatus.OK);
        }

    }

}
