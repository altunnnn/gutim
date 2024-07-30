package com.altun.gutim.service.impl;

import com.altun.gutim.service.EmailSender;
import com.altun.gutim.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
    private final EmailSender emailSender;

    @Override
    public void send(String email){
        emailSender.sendEmail(email);
    }
}
