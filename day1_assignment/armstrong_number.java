package day1_assignment;
import java.lang.Math;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int num1 = 9;
		int num2 = 1634;
		int num3 = 27;
		int num4 = 56;
		
		check_armstrong(num);
		check_armstrong(num1);
		check_armstrong(num2);
		check_armstrong(num3);
		check_armstrong(num4);
	}
	public static void check_armstrong(int num) {
		int sum=0;
		int length=0;
		int temp = num;
		while(temp>0) {
			temp=temp/10;
			length++;
		}
		temp = num;
		while (temp>0) {
			int r = temp%10;
			double z = Math.pow(r,length);
			sum = sum + (int)z;
			temp = temp / 10;
		}
		if (sum == num)
			System.out.println(num + " is a armstrong number");
		else
			System.out.println(num + " is not a armstrong number");
	}
}
