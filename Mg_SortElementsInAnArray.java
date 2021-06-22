package SDET;

import java.util.Arrays;
import java.util.Scanner;

public class Mg_SortElementsInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		System.out.println("Enter the array elements");
		int [] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
