package SDET;

import java.util.Scanner;

public class Ae_SwapInSingleLine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x ");
		int x=sc.nextInt();
		System.out.println("Enter y ");
		int y=sc.nextInt();
		y = x + y - (x = y);
		System.out.println("After swapping,x is "+x);
		System.out.println("After swapping,y is "+y);

	}

}
