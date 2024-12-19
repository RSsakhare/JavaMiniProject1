package com.seed1;

import com.seed.library.Book; 
import com.seed.library.utility.StoreUtil; 
import com.seed.library.utility.PrintUtil; 
import com.seed.library.utility.SortUtil; 

import java.util.HashSet; 
import java.util.Set;

public class LibraryMain {
	
	public static void main(String[] args) { 
		
		// Create Book objects 
		Set<String> authors1 = new HashSet<>(); 
		authors1.add("Author A"); 
		Book book1 = new Book(1, "Book One", authors1, 29.99); 
		
		Set<String> authors2 = new HashSet<>(); 
		authors2.add("Author B"); 
		Book book2 = new Book(2, "Book Two", authors2, 19.99); 
		
		// Create StoreUtil object 
		StoreUtil<Book> store = new StoreUtil<>(); 
		
		// Add books to StoreUtil 
		store.addRecord(book1); 
		store.addRecord(book2); 
		
		// Get number of books 
		System.out.println("Number of books: " + store.getNoOfRecords()); 
		
		
		// Print list of books 
		PrintUtil.printRecords(store.getRecords()); 
		
		// Sort books by name in ascending order 
		SortUtil.sortByName(store.getRecords()); 
		System.out.println("Books sorted by name:"); 
		PrintUtil.printRecords(store.getRecords()); 
		
		// Sort books by price in ascending order 
		SortUtil.sortByPrice(store.getRecords()); 
		System.out.println("Books sorted by price:"); 
		PrintUtil.printRecords(store.getRecords()); 
	}

}
