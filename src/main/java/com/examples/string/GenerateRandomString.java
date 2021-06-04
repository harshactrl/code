package com.examples.string;

import java.util.Random;

public class GenerateRandomString {

	public static void main(String[] args) {

		String str="1234567890";
		
		String sb = new String();
		Random random =new Random();
		
		int length= 6;
		
		
		for(int i = 0; i< length;i++) {
			
			int index = random.nextInt(str.length());
			char randomChar=str.charAt(index);
			
			
			
		}
		
	String randomString= sb.toString();
	   
	System.out.println("Random string is: "+ randomString);
	
	}
	

}
