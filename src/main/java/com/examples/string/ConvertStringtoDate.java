package com.examples.string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;




public class ConvertStringtoDate {
public static void main(String[] args) {
	

	//format yyy-mm-dd
	String string ="2021-04-12";
	LocalDate ld=LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
	System.out.println(ld);
	

	String string1="January 16, 2021";
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
	LocalDate ld1=LocalDate.parse(string1, formatter);
	System.out.println(ld1);
	
}	
}
