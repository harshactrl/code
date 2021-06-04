package com.examples.string;

public class StringIsNumeric {

public static void main(String[] args) {
	
	String str ="124b";
	boolean numeric= true;
	try {
	 Integer in=Integer.parseInt(str);//unchekedexception will occur if numeric values
	 System.out.println(in);
	}
	catch (NumberFormatException e) {//NumberFormatException will occur
		//when we convert the string to number value
		numeric = false;
	}
	
	if (numeric) {
		System.out.println(str+"is a number");
	}
	else {
		System.out.println(str + "is not number");
	}
	
	
}
}