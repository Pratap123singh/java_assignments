package day1_assignment;
import java.util.Scanner;

public class call_swap_two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter a number: ");
		float num2 = sc.nextFloat();
		
		swap_two_number obj = new swap_two_number();
		obj.swap(num1, num2);
		
	}

}
