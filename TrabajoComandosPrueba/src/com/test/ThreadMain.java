package com.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThreadMain {

	
	public static void main( String args[]) {
		System.out.println("Hello Git Hub SE REALIZA CAMBIO EN ARCHIVO");
 		System.out.println("Segunda linea commit en HIT HUB");
 		
 		LocalDate locadDate = LocalDate.of(2000, 3, 4);
 	
 		
 		System.out.println( locadDate );
 		System.out.println( LocalDate.parse("2000-01-02", DateTimeFormatter.ISO_DATE) );

 		System.out.println( locadDate );
 		System.out.println( LocalDate.parse("2000-01-02", DateTimeFormatter.ISO_DATE) );

	
	}
}
