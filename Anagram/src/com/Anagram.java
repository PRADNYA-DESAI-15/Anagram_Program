package com;

import java.util.Arrays;

public class Anagram {
	
	public static boolean anagram(String string1 , String string2) {
		if( string1.length() != string2.length())
			return false;
		
		char[] charword1 = string1.toCharArray();
		char[] charword2 = string2.toCharArray();
		
		Arrays.sort(charword1);
		Arrays.sort(charword2);
		
		return Arrays.equals(charword1, charword2);
		
	}
	
	public static void main(String[] args) {
		String string1 = "abcd";
		String string2 = "badc";
		
		if(anagram( string1, string2 ))
			System.out.println( string1 + " And " + string2 + " are Anagrams.");
		else
			System.out.println( string1+ " And " + string2 + " are not Anagrams.");
			  
	}
	

}
