package SDET;

import java.util.Scanner;

public class I_FibonacciSeriesGeneration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value until which you wanna generate the Fibonacci series");
		//Fn = Fn-1 + Fn-2 with seed values F0 = 0 and F1 = 1. 0 1 1 2 3 5 8 13 
		int n=sc.nextInt();
		int f1=0;
		System.out.print(f1);
		int f2=1;
		System.out.print(" "+f2);
		
		for(int i=2;i<n;i++) {
			 int f3=f1+f2;    
			  System.out.print(" "+f3);    
			  f1=f2;    
			  f2=f3; 		
		}
	}
}
