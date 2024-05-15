package day1_assignment;

import java.util.Scanner;

public class check_even_odd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int res = even_odd(num);
		if (res == 1)
			System.out.println(num + " is even.");
		else
			System.out.println(num + " is odd.");
	}
	
	public static int even_odd(int num) {
		if (num%2 == 0)
			return 1;
		else
			return 0;
	}
}
