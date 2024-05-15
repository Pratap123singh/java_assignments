package day1_assignment;
import java.lang.Math;
import java.util.Scanner;

public class simple_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		float num1 = sc.nextFloat();
		
		System.out.println("Enter number2: ");
		float num2 = sc.nextFloat();
		
		float result=0;
		
		System.out.println("To add press 'a'. ");
		System.out.println("To subtract press 's'. ");
		System.out.println("To multiply press 'm'. ");
		System.out.println("To divide press 'd'. ");
		
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a':
			result = num1 + num2;
			break;
		case 's':
			result = num1 - num2;
			break;
		case 'm':
			result = num1 * num2;
			break;
		case 'd':
			result = num1/num2;
			break;
		}
		System.out.println("Output: " + result);
		
	}

}
