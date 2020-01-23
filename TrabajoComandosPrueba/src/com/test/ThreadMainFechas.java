package com.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThreadMainFechas {
	
	
	public static void main( String args[] ) {
		
 		LocalDate locadDate = LocalDate.of(2000, 3, 4);
 	
 		System.out.println( locadDate );
 		
 		System.out.println( locadDate );
		 System.out.println( LocalDate.parse("2000-01-02", DateTimeFormatter.ISO_DATE) );
		 

		 System.out.println( locadDate );
		 

	}
} 
