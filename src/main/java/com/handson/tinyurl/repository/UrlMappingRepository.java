package com.handson.tinyurl.repository;

import com.handson.tinyurl.model.UrlMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlMappingRepository extends MongoRepository<UrlMapping, String> {
    UrlMapping findByShortCode(String shortCode);
}
