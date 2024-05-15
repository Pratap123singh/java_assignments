package day1_assignment;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int fact = 1;
		if (num < 0) {
			System.out.println("We can not calculate factorial of negative number");
		} else if (num == 0) {
			System.out.println("Factorial of 0 is 1");
		} else {
			for (int i = 1; i <= num; i++) {
				fact *= i;
			}
			System.out.println("Factorial of " + num + " is " + fact);
		}
	}

}
