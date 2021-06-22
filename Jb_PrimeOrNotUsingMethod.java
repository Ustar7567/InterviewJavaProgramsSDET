package SDET;

public class Jb_PrimeOrNotUsingMethod {
	public static void primeOrNot(int num) {
		
		if(num<2) {
			System.out.println(num+ " is not a prime because Prime numbers can't be less than 2");
		}
		else {
		//prime num is greater than 1 and has only 2 factors- 1 and the no. itself
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for non-prime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		}
	}
	public static void main(String[] args) {
		primeOrNot(3);
		primeOrNot(-8);
		primeOrNot(0);
		primeOrNot(1);
		primeOrNot(14);
		primeOrNot(37);
		primeOrNot(83);
		primeOrNot(72);
	}

}
