package day1_assignment;
import java.util.Scanner;

public class prime_or_not {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		check_prime(num);
	}
	public static void check_prime(int num) {
		int count = 0;
		boolean flag = false;
		for(int i=1; i<=num; i++) {
			if(num%i == 0)
				count++;
		}
		if (count == 2)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}