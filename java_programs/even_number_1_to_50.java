package java_practice;

public class even_number_1_to_50 {
	public static void main(String args[]) {
		int num = 1;
		while (num <= 50) {
			if (num % 2 == 0) {
				System.out.print(" " + num);
			}
			++num;
		}
	}
}
