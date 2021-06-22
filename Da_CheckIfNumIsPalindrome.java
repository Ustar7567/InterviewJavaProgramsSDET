package SDET;

import java.util.Scanner;

public class Da_CheckIfNumIsPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int temp=num;//don't forget.Otherwise, prints not a palindrome for even palindrome no.s
		int rev=0;
		for(;num!=0;num=num/10) {
			int rem=num%10;
			rev=rev*10+rem;
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
