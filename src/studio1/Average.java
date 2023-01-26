package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System. in);
System.out.println("The first of two integers to be averaged?");
int n1 =scanner.nextInt();
System.out.println("The second of two integers to be averaged?");
double n2 =scanner.nextInt();

System.out.println("The average of the two numbers is "+ (n1 + n2)/ 2);
	}

}
