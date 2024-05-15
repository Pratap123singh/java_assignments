package day1_assignment;

import java.util.Scanner;

public class max_among_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is max.");
			} else {
				System.out.println(num3 + " is max.");
			}
		} else if (num2 > num3) {
			System.out.println(num2 + " is max.");
		} else {
			System.out.println(num3 + " is max.");
		}
	}

}
