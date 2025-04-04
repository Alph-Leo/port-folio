package com.auth.portfoliobackend.data.repository;

import com.auth.portfoliobackend.data.models.ContactMe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactMeRepository extends MongoRepository<ContactMe, String> {
}
