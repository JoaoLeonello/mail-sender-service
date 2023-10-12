package com.joao.mailsender.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
