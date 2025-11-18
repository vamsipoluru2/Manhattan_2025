package com.manhattan.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manhattan.model.Book;

@RestController
@RequestMapping("/v2/app/book")
public class BookController {

    // ✅ Fetch single book by ID
    @GetMapping("/fetch/{id}")
    public ResponseEntity<Book> fetchBook(@PathVariable("id") Integer bid) {
        Book b = new Book(bid, "Java", 350.0);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    // ✅ Fetch book by ID and name
    @GetMapping("/fetch/id/{id}/name/{name}")
    public ResponseEntity<Book> fetchBookByIdAndName(@PathVariable("id") Integer bid, 
                                                     @PathVariable("name") String bname) {
        Book b = new Book(bid, bname, 500.0);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    // ✅ Fetch all books
    @GetMapping("/fetchAll")
    public ResponseEntity<List<Book>> fetchAllBooks() {
        List<Book> books = Arrays.asList(
            new Book(101, "Java", 350.0),
            new Book(102, "Python", 400.0),
            new Book(103, "Spring Boot", 550.0)
        );
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
