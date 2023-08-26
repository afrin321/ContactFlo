package com.contactflow.EmailService.Utils;

import com.contactflow.EmailService.Model.EmailRequest;

public class EmailGeneration {

    public static String  formatKeyGenerationEmail(String key) {
        return "<html>"
                + "<body>"
                + "<p>Your API Key is here!</p><p>Public Key: "
                + key +".</p><p>For more info, visit contactflo.org.</p>"
                + "</body>"
                + "</html>";
    }

    public static String  formatMessageGenerationEmail(String senderEmail, EmailRequest emailRequest) {
        String message = "";

        message += "<html>"
                + "<body>";

        if (senderEmail != null) {
            message += "<p>From: " + senderEmail + "</p>";
        }

        if (emailRequest.getSubject() != null) {
            message += "<p>Subject: " + emailRequest.getSubject() + "</p>";
        }

        if (emailRequest.getName() != null) {
            message += "<p>Name: " + emailRequest.getName() + "</p>";
        }

        if (emailRequest.getMessage() != null) {
            message += "<p>Message: " + emailRequest.getMessage() + "</p>";
        }

        if (emailRequest.getPhoneNo() != null) {
            message += "<p>Phone No: " + emailRequest.getPhoneNo() + "</p>";
        }

        if (emailRequest.getAddress() != null) {
            message += "<p>Address: " + emailRequest.getAddress() + "</p>";
        }

        if (emailRequest.getCity() != null) {
            message += "<p>City: " + emailRequest.getCity() + "</p>";
        }

        if (emailRequest.getZip() != null) {
            message += "<p>Zip: " + emailRequest.getZip() + "</p>";
        }

        message += "</body>"
                + "</html>";
        return message;
    }
}
