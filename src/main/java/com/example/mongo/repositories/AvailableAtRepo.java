package com.example.mongo.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableAtRepo
        extends MongoRepository<AvailableAtRepo, Integer> {
}

