package com.maryam.notification_service.service;

import com.maryam.notification_service.dtos.EmailDTO;

public interface IEmailService {

    void sendEmail(EmailDTO emailDTO);
}
