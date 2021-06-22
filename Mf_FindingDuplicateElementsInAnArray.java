package SDET;

import java.util.Scanner;

public class Mf_FindingDuplicateElementsInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		int [] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		//This method is called Brute force method
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
