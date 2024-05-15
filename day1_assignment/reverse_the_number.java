package day1_assignment;

public class reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 45698;
		int temp = num;
		int sum = 0;
		while(num>0) {
			int r = num%10;
			sum = (sum*10) + r;
			num = num / 10;
		}
		
		System.out.println("The reverse of the "  + temp + " is " + sum);
	}

}
