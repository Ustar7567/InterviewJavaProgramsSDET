package SDET;

import java.util.Scanner;

public class La_Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=sc.nextInt();
		int fac=1;
		if(n<0) {
			System.out.println("Factorial is not defined for negative number");
		}
		else if(n==0){
			System.out.println("Factorial is 1");
		}
		else {
			for(int i=1;i<=n;i++) {
				fac=fac*i;
			}
			System.out.println("Factorial is "+fac);
		}

	}

}
