package com;

import java.util.Arrays;

public class Prime_Anagram_Palindrom {

	    public static boolean isPalindrome(int num) {
	        String numStr = Integer.toString(num);
	        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
	        return numStr.equals(reversedNumStr);
	    }

	    public static boolean areAnagrams(int num1, int num2) {
	        String num1Str = Integer.toString(num1);
	        String num2Str = Integer.toString(num2);

	        char[] charArray1 = num1Str.toCharArray();
	        char[] charArray2 = num2Str.toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int limit = 10000;

	        for (int i = 2; i < limit; i++) {
	            if (isPrime(i) && isPalindrome(i)) {
	                for (int j = i + 1; j < limit; j++) {
	                    if (isPrime(j) && areAnagrams(i, j) && isPalindrome(j)) {
	                        System.out.println(i + " and " + j + " are prime, anagram, and palindrome.");
	                    }
	                }
	            }
	        }
	    }
}
