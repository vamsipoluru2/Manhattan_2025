package com.manhattan.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Libary {
	private List  books;
	private Set bookIds;
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
		return "Libary [books=" + books + ", bookIds=" + bookIds + ", priceMap=" + priceMap + "]";
	}

	
}
