package javaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "WOW";
		String reverse = "";
		int length = str.length();

		for (int i = (length - 1); i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("Number/String is Palindrome");
		} else {
			System.out.println("Number/String is not Palindrome");
		}

	}

}