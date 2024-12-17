package com.maryam.notification_service.service.impl;

import com.maryam.notification_service.dtos.EmailDTO;
import com.maryam.notification_service.exception.EmailException;
import com.maryam.notification_service.service.IEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements IEmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(EmailDTO emailDTO) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(emailDTO.getTo());
            message.setSubject(emailDTO.getSubject());
            message.setText(emailDTO.getBody());
            message.setSentDate(new Date());
            mailSender.send(message);
        } catch (Exception e) {
            throw new EmailException("Failed to send email: " + e.getMessage());
        }
    }
}
