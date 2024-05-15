package day1_assignment;

public class all_prime_no_between_1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 31;
		int count;
		for(int i=1; i<=31; i++) {
			count=0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0)
					count++;
			}
			if (count==2) {
				System.out.print(i + " ");
			}
		}
		
	}

}
