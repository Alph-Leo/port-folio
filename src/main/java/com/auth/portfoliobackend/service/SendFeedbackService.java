package com.auth.portfoliobackend.service;

import com.auth.portfoliobackend.dtos.request.SendFeedbackRequest;
import com.auth.portfoliobackend.dtos.response.SendFeedbackResponse;

public interface SendFeedbackService {
    SendFeedbackResponse sendFeedback(SendFeedbackRequest request);
}
