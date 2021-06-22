package SDET;

import java.util.Scanner;

public class Mg2_SortingElementsUsingBubbleSort {
	
	public void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swapping arr[j] and arr[j+1]
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
	
	public void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Mg2_SortingElementsUsingBubbleSort bs=new Mg2_SortingElementsUsingBubbleSort();
		int arr[]= {45,34,23,56,87,100};
		bs.bubbleSort(arr);
		System.out.println("Sorted array");
		bs.printArray(arr);

	}

}
