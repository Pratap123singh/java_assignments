package day1_assignment;
import java.util.Scanner;
public class triangle_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angles of a triangle: ");
		float angle1 = sc.nextFloat();
		float angle2 = sc.nextFloat();
		float angle3 = sc.nextFloat();
		
		float angle_sum = angle1 + angle2 +angle3;
		if (angle_sum == 360)
			System.out.println("Triangle is valid.");
		else
			System.out.println("Triangle is not valid.");		
	}

}
