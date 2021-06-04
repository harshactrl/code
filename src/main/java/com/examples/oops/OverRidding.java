package com.examples.oops;

class ConstructorDemo {

private ConstructorDemo(){
	System.out.println("constructor demo");
}

}
class ParentClass{
	
	ParentClass(){
		System.out.println("parent class");
	}
	
	void method1() {
		System.out.println("method 1");
	}
	
}

class ChildClass extends ParentClass{
	
	ChildClass(){
		System.out.println("child class");
	}

}

public class OverRidding{
	
public static void main(String[] args) {
	
	System.out.println("main method");
}

}
