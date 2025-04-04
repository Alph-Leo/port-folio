package com.auth.portfoliobackend.service;

import com.auth.portfoliobackend.data.models.ContactMe;
import com.auth.portfoliobackend.data.repository.ContactMeRepository;
import com.auth.portfoliobackend.dtos.request.SendFeedbackRequest;
import com.auth.portfoliobackend.dtos.response.SendFeedbackResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class SendFeedback implements SendFeedbackService{
    private final ContactMeRepository contactMeRepository;

    @Override
    public SendFeedbackResponse sendFeedback(SendFeedbackRequest request) {
        ContactMe contactMe = new ContactMe();
        contactMe.setUserName(request.getUserName());
        contactMe.setEmail(request.getEmail());
        contactMe.setPhoneNumber(request.getPhoneNumber());
        contactMe.setSubject(request.getSubject());
        contactMe.setMessage(request.getMessage());
        contactMe.setDateTime(LocalDateTime.now());

        contactMeRepository.save(contactMe);
        SendFeedbackResponse response = new SendFeedbackResponse();
        response.setMessage("Thank you for taking time to send us a feedback ):");

        return response;
    }
}
