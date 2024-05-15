package day1_assignment;

import java.util.Scanner;

public class sum_of_odd_even {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int even_sum = 0;
		int odd_sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				even_sum = even_sum + i;
			} else {
				odd_sum = odd_sum + i;
			}
		}
		System.out.println("Summation of odd number: " + odd_sum);
		System.out.println("Summation of even number: " + even_sum);
	}
}