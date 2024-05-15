package day1_assignment;
import java.util.Scanner;

public class call_add_two_number {
	public static void main(String args[]) {
		add_two_number obj = new add_two_number();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter a number: ");
		float num2 = sc.nextFloat();
		System.out.println(obj.summation(num1, num2));
	}
}
