package Test;

import pkg1.Library;
import java.util.Scanner;

public class TestLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Library l1 = null;
		int ch=1;

		do {
			System.out.println();
			System.out.println("Show all books press 1: ");
			System.out.println("Add new book press 2: ");
			System.out.println("Update book press 3: ");
			System.out.println("Delete book press 4: ");
			System.out.println("Edit name press 5: ");
			System.out.println("Edit author press 6: ");
			System.out.println("Edit price press 7: ");
			System.out.println("To exit press 8: ");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (l1 == null) {
					System.out.println("first create a book data.");
				} else {
					l1.showDetails();
				}
				break;
			case 2:
				System.out.println("Enter book id: ");
				int _id = sc.nextInt();
				System.out.println("Enter book name: ");
				String _book_name = sc.next();
				System.out.println("Enter book author: ");
				String _author = sc.next();
				System.out.println("Enter book price: ");
				double _price = sc.nextDouble();
				l1 = new Library(_id, _book_name, _author, _price);
				break;
			case 5:
				System.out.println("Enter new name: ");
				String s = sc.next();
				l1.setBookName(s);
				break;
			case 6:
				System.out.println("Enter new author: ");
				String a = sc.next();
				l1.setBookAuthor(a);
				break;
			case 7:
				System.out.println("Enter new price: ");
				double p = sc.nextDouble();
				l1.setBookPrice(p);
				break;
			case 8:
				ch=-1;
				break;
			}
		} while (ch != -1);

	}

}
