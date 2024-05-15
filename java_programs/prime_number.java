package java_practice;
import java.util.Scanner;
public class prime_number {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		
		if (num==0 || num == 1)
			flag=true;
		else if (num < 0)
			System.out.println("Invalid Number. number must be non negative.");
		
		for(int i=2; i<num; i++) {
			if (num%i == 0) {
				flag = true;
				break;
			}
			else
				flag = false;
		}
		if (flag == true)
			System.out.println("Not a prime number.");
		else
			System.out.println("Prime number.");
	}
}
