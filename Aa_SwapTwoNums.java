package SDET;

import java.util.Scanner;

public class Aa_SwapTwoNums {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		int t;
	    t=a;
	    a=b;
	    b=t;
	    System.out.println("After swapping a is,"+ a);
	    System.out.println("after swapping b is,"+ b);
		
		

	}

}
