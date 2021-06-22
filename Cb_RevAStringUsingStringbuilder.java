package SDET;

import java.util.Scanner;

public class Cb_RevAStringUsingStringbuilder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String st=sc.next();
		StringBuilder sb=new StringBuilder(st);
		System.out.println(sb.reverse());

	}

}
