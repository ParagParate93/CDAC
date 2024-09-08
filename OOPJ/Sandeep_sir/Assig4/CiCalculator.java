package org.example;
import java.util.Scanner;

public class CiCalculator {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		CompoundInterestCalculator c = new CompoundInterestCalculator();
		c.setAmount(s1);
		c.setDuration(s1);
		c.setNtimes(s1);
		c.setRate(s1);
		c.calculateFutureValue();
		c.printRecord();
		s1.close();
	}

}
