package SDET;

import java.util.Scanner;

public class Mb_EvenAndOddNumsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len=sc.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter the array numbers");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Even nums:");
		for(int i=0;i<len;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
		}
		System.out.println("Odd nums:");
		for(int i=0;i<len;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
