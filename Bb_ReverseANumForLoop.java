package SDET;

import java.util.Scanner;

public class Bb_ReverseANumForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int rev=0;
		
		for(;num!=0;num=num/10) {
			int rem=num%10;
			rev=rev*10+rem;
			
			//Above for loop can also be written as 
			//for(;num!=0){
			//int rem=num%10;
			//rev=rev*10+rem;
			//num=num/10;
		    //}
		}
		System.out.println("Reversed number is "+rev);

	}

}
