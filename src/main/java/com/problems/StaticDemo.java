package com.problems;

/*Static is keyword to enables the access the data without object creation and two 
ways to execute the static mehods or varibles that is
--> Direct access- We can access the values and methods directly if it is same class
--> By using ClassName-if we access the another class static blocks we can access by
using ClassName.*/
 class StaticDemo1 {

	protected static  int a =10;
	static void method1() {
		System.out.println("Static method");
	}
	static {
		
		System.out.println("static block");//It's automatically executed
	}
}
	public class StaticDemo{
		private int b;
		int a = b;
		
	public static void main(String []args) {
		
		System.out.println(StaticDemo1.a);
		StaticDemo1.method1();
	}

	}
