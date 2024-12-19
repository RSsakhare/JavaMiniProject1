package com.seed.library.utility;

import java.util.Comparator; 
import com.seed.library.Book;

public class CompareBookByPrice implements Comparator<Book>{
	
	public int compare(Book b1, Book b2) { 
		return Double.compare(b1.getPrice(), b2.getPrice()); 
		}

}
