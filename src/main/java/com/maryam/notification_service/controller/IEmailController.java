package com.maryam.notification_service.controller;

import com.maryam.notification_service.dtos.EmailDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface IEmailController {

    ResponseEntity<String> sendEmail(EmailDTO emailDTO);
}
