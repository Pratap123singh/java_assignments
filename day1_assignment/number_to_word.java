package day1_assignment;
import java.util.Scanner;
public class number_to_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number between 0 to 9: ");
		int ch = sc.nextInt();
		System.out.println("ch: " + ch);
		String str = Integer.toString(ch);
		System.out.println("str " + str);
		if (str.length() > 1) {
			ch = -1;
		}
		switch(ch) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 0:
				System.out.println("Zero");
				break;
			default:
				System.out.println("Invalid Number");
		}
	}

}
