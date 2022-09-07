package com.example.mongo.repositories;


import com.example.mongo.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo
        extends MongoRepository<Book, Integer> {
}

