package day1_assignment;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		// reverse
		int reverse = 0;
		while (num > 0) {
			int r = num % 10;
			reverse = (reverse * 10) + r;
			num = num / 10;
		}
				
		if (reverse == temp)
			System.out.println("It's a palindrome");
		else
			System.out.println("Not a palindrome.");
	}

}
