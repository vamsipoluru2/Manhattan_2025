package com.manhattan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.manhattan.model.Book;

//@Component
public class BookPostConsumer implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // Create RestTemplate object
        RestTemplate rt = new RestTemplate();

        // Correct URL for saving a book
        String url = "http://localhost:8080/v2/app/book/save";

        // Correct JSON body (field names must match Book class)
        String body = "{\"bid\":102,\"name\":\"Python\",\"price\":350.0}";

        // Create headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Combine headers and body into request entity
        HttpEntity<String> request = new HttpEntity<>(body, headers);

        // Call the REST API
        ResponseEntity<String> response = rt.postForEntity(url, request, String.class);

        // Print response details
        System.out.println("Status Code (String): " + response.getStatusCode().name());
        System.out.println("Status Code (int): " + response.getStatusCode().value());
        System.out.println("Response Body: " + response.getBody());
    }
}
