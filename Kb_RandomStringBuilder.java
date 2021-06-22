package SDET;

import java.util.Random;
import java.util.Scanner;

public class Kb_RandomStringBuilder {

	public static void main(String[] args) {
		//If we want the string to be generated from only capital letters, then pass the st value as A-Z
		//If we want the string to be generated from only small letters, then pass the st value as a-z
		//If we want the string to be generated from digits, then pass the st value as 0-9
		//If we want the string to be generated from only special characters, then pass the st value as only spl.characters
		//I want a combo of all the above. So, passing all
		String st="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+{}[]<,>.?/|\\0123456789";
	   
		// create random string builder
		StringBuilder sb=new StringBuilder();
		
	    // create an object of Random class
		Random random = new Random();

	    // specify length of random string
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the random string that should be generated");
	    int length = sc.nextInt();

	    for(int i = 0; i < length; i++) {

	      // generate random index number
	      int index = random.nextInt(st.length());

	      // get character specified by index
	      // from the string
	      char randomChar = st.charAt(index);

	      // append the character to string builder
	      sb.append(randomChar);
	    }

	    String randomString = sb.toString();
	    System.out.println("Random String is: \n" + randomString);

	  }
	}

