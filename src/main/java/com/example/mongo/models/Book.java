package com.example.mongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")

public class Book {

    @Id
    private int id;
    private String bookName;

    @DBRef(db="user")
    private User author;

    private language language;

    private List<AvaliableAt> NowAvaliableOn ;
}
