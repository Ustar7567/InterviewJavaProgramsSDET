package SDET;

import java.util.Arrays;
import java.util.Scanner;

public class Mc_CheckingEqualityOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the first array");
		int firstArrayLength=sc.nextInt();
		System.out.println("Enter the first array elements");
		int [] firstArray= new int [firstArrayLength];
	    for(int i=0;i<firstArrayLength;i++) {
	    	firstArray[i]=sc.nextInt();
	    
	    }
	    System.out.println("Enter the length of the second array");
	    int secArrayLength=sc.nextInt();
	    System.out.println("Enter the second array elements");
		int [] secArray= new int [secArrayLength];
	    for(int i=0;i<secArrayLength;i++) {
	    	secArray[i]=sc.nextInt();
	    }
	    
	    if(Arrays.equals(firstArray,secArray)) {
	    	System.out.println("Both the arrays are equal");
	    }
	    else {
	    	System.out.println("Both the arrays are NOT equal");
	    }
	}

}
