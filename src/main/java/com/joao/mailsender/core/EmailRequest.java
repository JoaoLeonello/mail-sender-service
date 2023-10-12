package com.joao.mailsender.core;

public record EmailRequest(String to, String subject, String body) {
}
