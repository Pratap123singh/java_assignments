package java_practice;
import java.lang.Math;
public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153 = 1^3 + 5^3 +3^3  ----> 3 == length of number
		//1634 = 1^4 + 6^4 + 3^4 + 4^4 ----> 4 == length of number
		//9 = 9^1 ----> 1 == length of number
		int num = 7;
		int num1 = num;
		double sum = 0;
		String str = Integer.toString(num);
		int l = str.length();
		while (num > 0) {
			int r = num % 10;
			sum = sum + Math.pow(r, l);
			num = num / 10;
		}
		if (num1 == sum) {
			System.out.println("Number "+ num1 + " is a armstrong number.");
		}
		else {
			System.out.println("Number "+ num1 + " is not a armstrong number.");
		}
	}

}
