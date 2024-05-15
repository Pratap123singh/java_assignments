package day1_assignment;
import java.util.Scanner;
public class m_to_power_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base = sc.nextInt();
		System.out.println("Enter power: ");
		int power = sc.nextInt();
		int res = 1;
		int p = power;
		while(power>=1) {
			res*=base;
			power--;
		}
		System.out.println(base + " raised to the "+p +" : " + res);
	}

}
