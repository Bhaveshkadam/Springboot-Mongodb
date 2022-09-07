package com.example.mongo.controller;
import com.example.mongo.models.Book;
import com.example.mongo.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepo repo;

    @PostMapping("/addBook")
    @RequestMapping(value = "/addBook", method= RequestMethod.POST)
    public String saveBook(@RequestBody Book book){
        repo.save(book);

        return "Added Successfully";
    }

    @GetMapping("/findAllBooks")
    @RequestMapping(value = "/findAllBooks", method= RequestMethod.GET)
    public List<Book> getBooks() {

        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    @RequestMapping(value = "/delete/{id}", method= RequestMethod.DELETE)
    public String deleteBook(@PathVariable int id){
        repo.deleteById(id);

        return "Deleted Successfully";
    }

}
