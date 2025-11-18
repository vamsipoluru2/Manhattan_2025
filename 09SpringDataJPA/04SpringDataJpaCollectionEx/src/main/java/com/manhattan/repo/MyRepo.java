package com.manhattan.repo;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.manhattan.entity.Book;
 
public interface MyRepo extends JpaRepository<Book,Integer>{
 
}
 