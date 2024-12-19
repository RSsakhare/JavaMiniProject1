package com.seed.library.utility;

import java.util.List;

public class PrintUtil {
	
	public static <T> void printRecords(List<T> records) { 
		
		for (T record : records) { 
			System.out.println(record); 
			} 
		}

}
