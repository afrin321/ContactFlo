package com.contactflow.EmailService.Service;

import com.contactflow.EmailService.Model.EmailRequest;
import com.contactflow.EmailService.Utils.EmailGeneration;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final HtmlEmail htmlEmail;

    @Autowired
    public EmailService(HtmlEmail htmlEmail) {
        this.htmlEmail = htmlEmail;
    }

    public void sendEmail(String to, String subject, String key) throws EmailException {
        htmlEmail.setFrom("afrinh667@gmail.com");
        htmlEmail.addTo(to);
        htmlEmail.setSubject(subject);
        htmlEmail.setHtmlMsg(EmailGeneration.formatKeyGenerationEmail(key));
        htmlEmail.send();
    }

    public void sendEmailMessage(String email, EmailRequest emailRequest) throws EmailException {

        htmlEmail.setFrom("afrinh667@gmail.com");
        htmlEmail.addTo(email);
        htmlEmail.setSubject("Contact Flo - You received a new message");
        htmlEmail.setHtmlMsg(EmailGeneration.formatMessageGenerationEmail(email, emailRequest));
        htmlEmail.send();
    }
}
