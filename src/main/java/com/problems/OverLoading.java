package com.problems;

public class OverLoading {
	

	static int c;
	public static void m1() {
		System.out.println("m1 method");
	}
	public static void m2(int a , int b) {
		c=a+  b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		m1();
		m2(10,20);
	}
	
}
