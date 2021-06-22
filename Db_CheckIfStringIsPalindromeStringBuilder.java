package SDET;

import java.util.Scanner;

public class Db_CheckIfStringIsPalindromeStringBuilder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.next();
		
		
		StringBuilder sb=new StringBuilder(st);
		sb.reverse();
		String rev=sb.toString();
		
		if(st.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
