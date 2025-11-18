package com.manhattan.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

    @Autowired
    private List books;   

    @Autowired
    private Set novels;   
    
    @Autowired
    private Map bookMap;  
    
    
   



	public void setBooks(List books) {
		this.books = books;
	}


	public void setNovels(Set novels) {
		this.novels = novels;
	}


	public void setBookMap(Map bookMap) {
		this.bookMap = bookMap;
	}






	@Override
    public String toString() {
        return "Library [books=" + books + ", novels=" + novels + ", bookMap=" + bookMap + "]";
    }
}
