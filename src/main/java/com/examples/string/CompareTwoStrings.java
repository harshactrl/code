package com.examples.string;

public class CompareTwoStrings {

	
	

	public static void main(String[] args) {
		String str = "String";
		String str1= "string";
		
		String str2=new String("String");
		String str3=new String("string");
		//str=="string".here == operator only verifies the references equal  or not.
		//it's not compare the values of object. not supported ignorecase
		if(str=="string") {
			System.out.println("str==string");
		}
		else {
			System.out.println("str!=string");
		}
		//str==str1
		if(str==str1) {
			System.out.println("str==string");
		}
		else {
			System.out.println("str!=string");
		}
		//str2==str3
		if(str2==str3) {
			System.out.println("str==str3");
		}
		else {
			System.out.println("str!=str3");
		}
		
		//str2.equals(str3) //equal() method can verify the objects not references of object
		// its checks the value of the value is equal or not.
		if(str2.equals(str3)) {
			System.out.println("str==str3");
		}
		else {
			System.out.println("str!=str3");
		}
		
		//str.equals(str1)
				if(str.equalsIgnoreCase(str1)) {
					System.out.println("str==str1");
				}
				else {
					System.out.println("str!=str1");
				}
		
		
		
	}
	
	
}
