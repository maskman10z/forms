package com.fahed.forms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import static com.fahed.forms.utils.Constants.SENDER_EMAIL;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Value("${MAIL_TO}")
    private String mailTo;

    @Value("${MAIL_SUBJECT}")
    private String mailSubject;

    public void send(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(SENDER_EMAIL);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        emailSender.send(message);
    }

    public void send(String text) {
        this.send(mailTo, mailSubject, text);
    }
}
