package com.manhattan.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
 
 @Id
 private Integer id;
 private String bname;
 private double price;

}
 