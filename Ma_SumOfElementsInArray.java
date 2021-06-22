package SDET;

import java.util.Arrays;
import java.util.Scanner;

public class Ma_SumOfElementsInArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arrLen=sc.nextInt();
		int [] arr=new int [arrLen];
		System.out.println("Enter the numbers in the array");
		for(int i=0;i<arrLen;i++) {
			Scanner sc1=new Scanner(System.in);
			arr[i]=sc1.nextInt();	
		}
		int sum=0;
		for(int j=0;j<arrLen;j++) {
			sum=sum+arr[j];
		}
		System.out.println("Sum is "+sum);
	}
}
