package com.contactflow.EmailService.Controller;

import com.contactflow.EmailService.Model.EmailRequest;
import com.contactflow.EmailService.Service.ApiKeyService;
import com.contactflow.EmailService.Service.EmailService;
import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contactus")
public class EmailGenerationController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private ApiKeyService apiKeyService;

    @PostMapping("/new")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) throws EmailException {
        String email = apiKeyService.findRegisteredKey(emailRequest.getApiKey());

        if (email != null) {
            emailService.sendEmailMessage(email, emailRequest);
            return new ResponseEntity<>("Success", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Key does not exist!", HttpStatus.NOT_FOUND);
        }

    }

}
