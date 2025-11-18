package com.manhattan.repo;

import org.springframework.data.repository.CrudRepository;

import com.manhattan.entity.Book;

public interface MyRepo extends CrudRepository<Book, Integer> {
 
 
 
}
 