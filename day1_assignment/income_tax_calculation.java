package day1_assignment;
import java.util.Scanner;
public class income_tax_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your basic salary: ");
		double basic = sc.nextDouble();
		double tax;
		if (basic < 150000)
			tax = 0;
		else if (150000 < basic && basic < 300000)
			tax = 0.15;
		else 
			tax = 0.30;
		
		double income_tax = basic * tax;
		System.out.println("Tour income tax: " + income_tax);
		
	}

}
