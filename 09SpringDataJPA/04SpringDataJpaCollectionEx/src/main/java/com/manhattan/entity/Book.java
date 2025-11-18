package com.manhattan.entity;
 
import java.util.List;
import java.util.Map;
import java.util.Set;
 
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
 
    @Id
    private Integer bId;
 
    private String bname;
 
    private double price;
 
    @ElementCollection
    @CollectionTable(name = "book_publ", joinColumns = @JoinColumn(name = "bId_Fk"))
    @Column(name = "publisher_name")
    private Set<String> publisher;
 
    @ElementCollection
    @CollectionTable(name = "book_auth", joinColumns = @JoinColumn(name = "bId_Fk"))
    @OrderColumn(name = "author_index")
    @Column(name = "author_name")
    private List<String> author;
 
    @ElementCollection
    @CollectionTable(name = "book_vend", joinColumns = @JoinColumn(name = "bId_Fk"))
    @MapKeyColumn(name = "vend_key")
    @Column(name = "vend_value")
    private Map<String, String> vendors;
    
    
    
}