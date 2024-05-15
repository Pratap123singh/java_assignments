package day1_assignment;

import java.util.Scanner;

public class divisible_by_5_and_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		divisiblity_check(num);
	}
	
	public static void divisiblity_check(int num) {
		if (num%5 == 0 && num%11 ==0)
			System.out.println(num + " is divisible by 5 and 11.");
		else
			System.out.println(num + " is not divisible by 5 and 11.");
	}

}
