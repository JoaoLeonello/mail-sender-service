package com.joao.mailsender.core;

public interface SendEmailUseCase {
    void sendEmail(String to, String subject, String body);
}
