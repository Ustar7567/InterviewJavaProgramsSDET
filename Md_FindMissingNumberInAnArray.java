package SDET;

import java.util.Arrays;

public class Md_FindMissingNumberInAnArray {

	public static void main(String[] args) {
		int a[]= {7,1,2,3,4,5,10,9,8};//raw array
		Arrays.sort(a);//sorts the array in ascending order
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		//System.out.println(sum);
		
		int sum1=0;
		for(int i=a[0];i<=a.length+1;i++) {
		sum1=sum1+i;
		}
		//System.out.println(sum1);
		
		System.out.println("Missing number in the array is "+(sum1-sum));

	}

}
