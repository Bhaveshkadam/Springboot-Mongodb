package com.example.mongo.repositories;


import com.example.mongo.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo
        extends MongoRepository<Book, Integer> {
}

