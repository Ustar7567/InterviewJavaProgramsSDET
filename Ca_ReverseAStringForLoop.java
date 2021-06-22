package SDET;

import java.util.Scanner;

public class Ca_ReverseAStringForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to be reversed");
		String input=sc.next();
		int len=input.length();
		
		for(int i=len-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}

	}

}
