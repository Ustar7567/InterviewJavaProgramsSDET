package SDET;

import java.util.Random;
import java.util.stream.IntStream;

public class Ka_GenerateRandomNumber {

	public static void main(String[] args) {
		Random rnd=new Random();
		int rndInt=rnd.nextInt(1000000);
		long rndLng=rnd.nextLong();
		float rndFlt=rnd.nextFloat();
		double rndDbl=rnd.nextDouble();
		System.out.println(rndInt);
		System.out.println(rndLng);
		System.out.println(rndFlt);
		System.out.println(rndDbl);
		long sum=rndInt+rndLng;
		System.out.println(sum);
	}

}
