package com.maryam.notification_service.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


public class EmailDTO {

    @NotBlank(message = "Recipient email is required")
    @Email(message = "Must be a well-formed email address")
    private String to;

    @NotBlank
    private String subject;

    @NotBlank
    private String body;


    public @Email @NotBlank String getTo() {
        return to;
    }

    public void setTo(@Email @NotBlank String to) {
        this.to = to;
    }

    public @NotBlank String getSubject() {
        return subject;
    }

    public void setSubject(@NotBlank String subject) {
        this.subject = subject;
    }

    public @NotBlank String getBody() {
        return body;
    }

    public void setBody(@NotBlank String body) {
        this.body = body;
    }
}
