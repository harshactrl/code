package com.examples.string;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagrams {

	public static void main(String[] args) {

		String str1 ="Race";
		String str2 ="Care";

		if(str1.length()==str2.length()) {
			
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			boolean result=Arrays.equals(char1, char2);
			
			if(result) {
				System.out.println(str1+" and "+ str2+ " are anagram");
			}
			else
			{
				System.out.println(str1+" and "+str2+" are not anagram");
			}
		}
		
		else {
		      System.out.println(str1 + " and " + str2 + " are not anagram.");
		    }

		
	}

}
