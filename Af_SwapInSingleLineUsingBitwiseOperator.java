package SDET;

import java.util.Scanner;

public class Af_SwapInSingleLineUsingBitwiseOperator {
	
	//In order to swap two variable using single expression or in single line we could use bitwise XOR operator of Java.
    //As we now that in Java XOR functions as XOR of two numbers a and b returns a number which has all the bits as 1 wherever bits of a and b differs.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x ");
		int x=sc.nextInt();
		System.out.println("Enter y ");
		int y=sc.nextInt();
		y = x ^ y ^ (x = y);
		System.out.println("After swapping,x is "+x);
		System.out.println("After swapping,y is "+y);

	}

}
