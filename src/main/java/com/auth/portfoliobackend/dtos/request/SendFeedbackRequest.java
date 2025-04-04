package com.auth.portfoliobackend.dtos.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class SendFeedbackRequest {
    private String userName;
    private String phoneNumber;
    private String email;
    private String subject;
    private String message;
    private LocalDateTime dateTime;

}
