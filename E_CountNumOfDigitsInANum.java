package SDET;

import java.util.Scanner;

public class E_CountNumOfDigitsInANum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			num=num/10;
			++count;
		}
		System.out.println("No. of digits is "+count);

	}

}
