package day1_assignment;

import java.util.Scanner;

public class pizza_menu_driven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************** Pizza Cart ********************\n");
		Scanner sc = new Scanner(System.in);
		
		int q = 0;
		int pizza_qty = 0, colddrinks_qty = 0, fries_qty= 0, choco_lava_qty=0;
		
		do {
			System.out.println("For Pizza press -> 1");
			System.out.println("For Colddrinks press -> 2");
			System.out.println("For Fries press -> 3");
			System.out.println("For Choco lava press -> 4");
			System.out.println("To Exit press -> 5");
			System.out.print("\nFill choice: ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter quantity: ");
				pizza_qty = sc.nextInt();
				break;
			case 2:
				System.out.println("Enter quantity: ");
				colddrinks_qty = sc.nextInt();
				break;
			case 3:
				System.out.println("Enter quantity: ");
				fries_qty = sc.nextInt();
				break;
			case 4:
				System.out.println("Enter quantity: ");
				choco_lava_qty = sc.nextInt();
				break;
			case 5:
				q = -1;
			}
		}while(q!=-1);
		int total_amount = (pizza_qty*100 + colddrinks_qty * 40 + fries_qty * 80 + choco_lava_qty * 50);
		System.out.println("Total Bill: " + total_amount);
	}

}
