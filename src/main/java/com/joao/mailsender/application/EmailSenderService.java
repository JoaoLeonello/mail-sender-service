package com.joao.mailsender.application;

import com.joao.mailsender.adapters.EmailSenderGateway;
import com.joao.mailsender.core.SendEmailUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements SendEmailUseCase {
    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway) {
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
