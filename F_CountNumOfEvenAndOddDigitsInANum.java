package SDET;

import java.util.Scanner;

public class F_CountNumOfEvenAndOddDigitsInANum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		
		while(num!=0) {
			int rem=num%10;
			if(rem%2==1) {
				odd++;
			}
			else {
				even++;
			}
			num=num/10;
		}
		System.out.println("num of odd digits is "+odd);
		System.out.println("num of even digits is "+even);

	}

}
