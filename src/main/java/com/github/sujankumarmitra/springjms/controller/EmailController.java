package com.github.sujankumarmitra.springjms.controller;

import com.github.sujankumarmitra.springjms.messaging.EmailSender;
import com.github.sujankumarmitra.springjms.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    private EmailSender emailSender;

    @Autowired
    public EmailController(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @PostMapping
    public ResponseEntity sendEmail(@RequestBody Email email) {
        emailSender.sendEmail(email);
        return ResponseEntity
                .accepted()
                .build();

    }

}
