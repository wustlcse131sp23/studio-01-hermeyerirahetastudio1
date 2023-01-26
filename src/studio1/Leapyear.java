package studio1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System. in);

		System.out.println("What year is it ");
		int year =scanner.nextInt();
		boolean leapyear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		
		System.out.println(leapyear);
	}

}
