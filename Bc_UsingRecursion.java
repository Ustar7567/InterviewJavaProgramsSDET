package SDET;

import java.util.Scanner;

public class Bc_UsingRecursion {
	
//Recursion is a basic programming technique you can use in Java, in which a method calls itself to solve some problem. 

	public static void RevNumUsingRecursion(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		}
		else {
			System.out.print(num%10);
			RevNumUsingRecursion(num/10);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		int num=sc.nextInt();
		System.out.println("Reversed num is");
		RevNumUsingRecursion(num);
	}

}
