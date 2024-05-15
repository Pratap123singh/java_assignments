package java_practice;

public class fibonnaci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 21 ...
		
		int f0 = 0;
		int f1 =1;
		int count = 0;
		int num = 9;
		int sum = 0;
		System.out.println("Fibonaaci Series upto "+ num +" terms");
		System.out.print(f0 +" "+ f1);
		
		while (count < num - 2) {
			sum = f0 + f1;
			System.out.print(" "+ sum);
			f0 = f1;
			f1 = sum;
			count+=1;
		}
		
	}

}
