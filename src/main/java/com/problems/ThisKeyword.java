package com.problems;

public class ThisKeyword {

	int a ;
	
      public static void method(int a) {
		/* this.a; this keyword not allowed in static block */
		System.out.println("Static method executed...");
	}
      public void method1(int a) {
    	  int b=2;
		System.out.println("method-1"+(b+a));
	}
	public static void main(String[] args) {
		method(2);
		ThisKeyword tk= new ThisKeyword();
		System.out.println("main method executed");
		tk.method1(10);
	}
	
}
