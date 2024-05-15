package java_practice;

public class all_prime_number_1_to_100 {
	public static void main(String args[]) {
		
		int count = 0;
		int num = 2;
		boolean flag = false;
		
		while (count<100) {
			for(int i = 2; i < num; i++) {
				if (num % i == 0)
					flag = true;
			}
			if (flag == false) {
					System.out.print(" " + (num));
					count+=1;
			}
			flag = false;
			num+=1;
		}
	}
}
