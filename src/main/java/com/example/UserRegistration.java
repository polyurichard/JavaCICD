package com.example;
public class UserRegistration {
    private EmailService emailService;

    public UserRegistration(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
        // registration logic
        emailService.sendConfirmationEmail(email);
    }
}