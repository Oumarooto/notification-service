package com.maryam.notification_service.controller.impl;

import com.maryam.notification_service.controller.IEmailController;
import com.maryam.notification_service.dtos.EmailDTO;
import com.maryam.notification_service.service.IEmailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emails")
@Tag(name = "Notification Service Controller", description = "Notification Service, envoi email")
@CrossOrigin("*")
public class EmailControllerImpl implements IEmailController {

    @Autowired
    private IEmailService emailService;

    @Override
    @Operation(summary = "Envoi un nouveau message", description = "Envoie de nouveau message")
    @ApiResponse(responseCode = "201", description = "Message envoye avec succès")
    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@Valid @RequestBody EmailDTO emailDTO) {
        emailService.sendEmail(emailDTO);
        return ResponseEntity.ok("Email sent successfully.");
    }
}
