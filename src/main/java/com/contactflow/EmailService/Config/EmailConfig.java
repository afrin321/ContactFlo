package com.contactflow.EmailService.Config;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfig {

    @Value("${spring.mail.username}")
    private String emailUsername;

    @Value("${spring.mail.password}")
    private String emailPassword;

    @Value("${spring.mail.host}")
    private String host;

    @Bean
    public HtmlEmail htmlEmail() throws EmailException {
        HtmlEmail email = new HtmlEmail();
        email.setHostName(host);
        email.setSmtpPort(587);
        email.setAuthentication(emailUsername, emailPassword);
        email.setStartTLSEnabled(true);
        return email;
    }
}
