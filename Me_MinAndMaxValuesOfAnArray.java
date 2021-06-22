package SDET;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Me_MinAndMaxValuesOfAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int length=sc.nextInt();
		Integer [] arr=new Integer[length];
		/*To get the minimum or maximum value from the array we can use the Collections.min() and Collections.max() methods. 
		 Note:  “The array you are are passing to the Arrays.asList() must have a return type of Integer or whatever class you want to use”, since the Collections.sort() accepts ArrayList object as a parameter. 
         Note: If you use type int while declaring the array you will end up seeing this error: “no suitable method found for min(List<int[]>)”
		 */
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		int min=Collections.min(Arrays.asList(arr));
		System.out.println("Min value is "+min);
		int max=Collections.max(Arrays.asList(arr));
		System.out.println("Max value is "+max);

	}

}
