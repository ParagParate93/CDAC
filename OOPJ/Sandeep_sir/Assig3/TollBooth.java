package org.example;

import java.util.Scanner;

public class TollBooth {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		TollBoothRevenueManager t= new TollBoothRevenueManager();
		t.acceptRecord(s1);
		t.setTollRates(s1);
		t.calculateRevenue();
		t.printRecord();
		
		s1.close();
	}

}
