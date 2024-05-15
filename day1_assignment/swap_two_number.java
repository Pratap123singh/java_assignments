package day1_assignment;

public class swap_two_number {
	public void swap(float num1, float num2) {
		System.out.println("Numbers before swapping: ");
		System.out.println("num1: " + num1 + "  " + "num2: " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Numbers after swapping: ");
		System.out.println("num1: " + num1 + "  " + "num2: " + num2);
	}
}
