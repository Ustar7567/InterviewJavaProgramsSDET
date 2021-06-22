package SDET;

import java.util.Scanner;

public class H_LargestOf3Nums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num-x");
		int x=sc.nextInt();
		System.out.println("Enter second num-y");
		int y=sc.nextInt();
		System.out.println("Enter third num-z");
		int z=sc.nextInt();
		if(x>y && x>z) {
			System.out.println("x is the largest number");
		}
		else if(y>z) {
			System.out.println("y is the largest number");
		}
		else {
			System.out.println("z is the largest number");
		}
	}

}
