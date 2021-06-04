 package com.examples.string;

public class StringDemo {

	
	
	
	String str ="raju";
	char[] ch= {'j','a','v','a'};
	String str1= "srikanth";
	String str2="srikanth";
	
	String s=new String("raju");
	String scharray=new String(ch);
	public static void main(String[] args) {
	
		String s="srikanth";
		s=s.concat("-java");
		
		/*Why string objects are immutable in java?
Because java uses the concept of string literal.
Suppose there are 5 reference variables,all refers to one object "srikanth".
If one reference variable changes the value of the object,
 it will be affected to all the reference variables. 
That is why string objects are immutable in java.
for ex: company name once we create we use that name with
 reference as employee but i can't modify the company name.

*/
		
		System.out.println(s);
		StringDemo st=new StringDemo();
		StringDemo st1 =new StringDemo();
	
		System.out.println(st.scharray);
		System.out.println(st.str.hashCode());
		System.out.println(st.str1.hashCode());
		System.out.println(st.s.hashCode());
		System.out.println(st.str2.hashCode());
		System.out.println("hashcode of st="+st.hashCode());
		System.out.println("hashcode of st1="+st1.hashCode());
		System.out.println("equals method="+st.equals(st1));
		System.out.println("get class"+st.getClass());
		System.out.println("charAt="+st.str.charAt(2));
		System.out.println("codePointAt="+st.str.codePointAt(0));
		System.out.println("codePointBefore="+st.str.codePointBefore(2));
		System.out.println("codePointCount="+st.str.codePointCount(2,4 ));
		System.out.println("compareTo="+st.str.compareTo(st.str1));
		System.out.println("concat="+st.str.concat(st1.str1));
		System.out.println("hashcode="+st.str.hashCode());
		System.out.println("indexOf of character="+st.str.indexOf('j'));
		System.out.println("indexOf of string="+st.str.indexOf("ju"));
		System.out.println("indexOf ="+st.str.indexOf('j', 2));
		System.out.println("indexOf ="+st.str.indexOf(st.str, 2));
		System.out.println("intern ="+st.str1.intern());
		System.out.println("length ="+st.str1.length());
		System.out.println("lowercase ="+st.str1.toLowerCase());
		System.out.println("uppercase ="+st.str1.toUpperCase());
		System.out.println("trim ="+st.str1.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}
	
	
	
}
