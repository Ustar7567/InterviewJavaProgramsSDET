package SDET;

import java.util.Scanner;

public class Mf_FindingIfGivenElementIsPresentInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		int [] arr=new int[len];
		
		System.out.println("enter the elements of the array");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to check in the array");
		int elementToCheck=sc.nextInt();
		
		boolean test=false;
		
		for(int element: arr) {
			if(element==elementToCheck) {
				test=true;
				break;
			}
		}
		if(test==true) {
			System.out.println("Entered element is present in the array");
		}
		else {
			System.out.println("Entered element is not present in the array");
		}

	}

}
