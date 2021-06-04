package com.examples.string;

public class StringBufferDemo {

	String str="name";
	/*
	 * The immutable objects are increase the performance of the system.
	 * string constant pool takes the responsibility store the data in string pool
	 * we can create the string object by using direct initialization and using new 
	 * operator. The new operator will create the object in heap memory,but indirectly
	 * refers the string constant pool object if the value of this new same as constant 
	 * pool stored value. 
	 * Here string is immutable and once we create the string we can't change it and
	 * it will always refers the multiple references with same value this is
	 * consumes the more memory space.
	 * whenever we create the string object it will create one reference in the heap
	 * memory.if the without any reference variable object are there in heap memory 
	 * the garbage collector delete those unreference objects
	 */
	String str1="name";
	
	/*
	 * string mutable is simply called as update the value or replace the value in
	 * string class object never replace the value it will refer the object of same
	 * value mutable objects are if we modifies the value everytime it will store
	 * the same location
	 * we have two mutable classes are there in java:
	 * StringBuffer and StringBuilder
	 * StringBuffer is thread safe and synchronised.
	 * means we can execute different tasks at the same time in a program.
	 * Prefered StringBuffer class always because the StringBuilder is not thread 
	 * safe and unsynchronised.
	 */
	StringBuffer sb=new StringBuffer(str);
	StringBuffer sb1=new StringBuffer(str1);
	
	public static void main(String[] args) {
		StringBufferDemo sbd=new StringBufferDemo();
		System.out.println("using stringbuffer:"+sbd.sb.hashCode());
		System.out.println("using stringbuffer:"+sbd.sb1.hashCode());
		System.out.println("using string class:"+sbd.str.hashCode());
		System.out.println("using string class:"+sbd.str1.hashCode());
		
	}
}
