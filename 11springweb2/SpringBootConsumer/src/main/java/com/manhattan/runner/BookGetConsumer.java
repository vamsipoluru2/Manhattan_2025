package com.manhattan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.manhattan.model.Book;

@Component
public class BookGetConsumer implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // Create RestTemplate object
        RestTemplate rt = new RestTemplate();

        // Correct URL for fetching a single book by ID
        String url = "http://localhost:8080/v2/app/book/fetch/{id}";

        // Call the REST API
        ResponseEntity<Book> response = rt.getForEntity(url, Book.class, 101);

        // Print response details
        System.out.println("Status Code (String): " + response.getStatusCode().name());
        System.out.println("Status Code (int): " + response.getStatusCode().value());
        System.out.println("Response Body: " + response.getBody());
    }
}
