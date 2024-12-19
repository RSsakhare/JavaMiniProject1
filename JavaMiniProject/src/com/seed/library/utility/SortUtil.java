package com.seed.library.utility;

import java.util.Collections; 
import java.util.List; 
import com.seed.library.Book;

public class SortUtil {
	
	public static void sortByName(List<Book> books) { 
		Collections.sort(books, new CompareBookByName()); 
		} 
	
	public static void sortByPrice(List<Book> books) { 
		Collections.sort(books, new CompareBookByName()); 
		}

}
