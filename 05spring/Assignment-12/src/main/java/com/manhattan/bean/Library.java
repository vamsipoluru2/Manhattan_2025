package com.manhattan.bean;

import java.util.List;
import java.util.Set;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("lib")
public class Library {


	 @Value("#{'${books.list}'.split(',')}")

    private List books;
	    @Value("#{'${books.set}'.split(',')}")

    private Set bookIds; 
	    
	    @Value("#{${books.map}}")

    private Map priceMap;    

	


		public void setBooks(List books) {
			this.books = books;
		}

		public void setBookIds(Set bookIds) {
			this.bookIds = bookIds;
		}

		public void setPriceMap(Map priceMap) {
			this.priceMap = priceMap;
		}




	@Override
    public String toString() {
        return "Library [books=" + books + ", bookIds=" + bookIds + ", priceMap=" + priceMap + "]";
    }
}
