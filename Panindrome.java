package com.jagjit.Hactoberfest;

import java.util.Scanner;

public class Panindrome {

	// function to check palindrome
	public static boolean isPalindrome(String s) {

		// if length of the string 0 or 1 then String is palindrome
		if (s.length() == 0 || s.length() == 1)
			return true;

		// check first and last char of String:
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1)); // Function calling itself: Recursion

		// if control reaches where character does not match the return false
		return false;
	}

	public static void main(String[] args) {

		// For user input
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String string = scanner.nextLine();

		/*
		 * isPalindrome is a function which returns true if function is palindrome or
		 * not
		 *
		 */

		if (isPalindrome(string.toLowerCase()))
			System.out.println(string + " is a palindrome");
		else
			System.out.println(string + " is not a palindrome");

	}

}
