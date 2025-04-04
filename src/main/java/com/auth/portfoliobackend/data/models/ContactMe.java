package com.auth.portfoliobackend.data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Document("Visitor's contact")
public class ContactMe {
    @Id
    private String id;
    private String userName;
    private String phoneNumber;
    private String email;
    private String subject;
    private String message;
    private LocalDateTime dateTime;

}
