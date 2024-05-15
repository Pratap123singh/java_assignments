package day1_assignment;
import java.util.Scanner;
public class sum_of_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter last number of series: ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		for(int i=1; i<=num; i++) {
			System.out.print(i);
			if (i!=num)
				System.out.print(" + ");
		}
		System.out.println();
		System.out.println("The summation of series: " + sum);
	}

}
