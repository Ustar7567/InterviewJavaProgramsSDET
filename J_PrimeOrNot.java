package SDET;

import java.util.Scanner;

public class J_PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num to check");
		int num=sc.nextInt();
		if(num<2) {
			System.out.println("Prime numbers can't be less than 2");
		}
		else {
		//prime num is greater than 1 and has only 2 factors- 1 and the no. itself
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for non-prime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}
		
	}
