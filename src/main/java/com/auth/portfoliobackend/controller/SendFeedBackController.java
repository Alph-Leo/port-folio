package com.auth.portfoliobackend.controller;

import com.auth.portfoliobackend.dtos.request.SendFeedbackRequest;
import com.auth.portfoliobackend.dtos.response.SendFeedbackResponse;
import com.auth.portfoliobackend.service.SendFeedbackService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/feedback")
@CrossOrigin("*")
@AllArgsConstructor
@Slf4j
public class SendFeedBackController {

    private final SendFeedbackService sendFeedbackService;


    @PostMapping(value = "/send",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SendFeedbackResponse> sendFeedback(@RequestBody SendFeedbackRequest request) {
        log.info("Received feedback request -------->{}", request);
        SendFeedbackResponse response = sendFeedbackService.sendFeedback(request);
        log.info("This is the response ------->{}", response);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
