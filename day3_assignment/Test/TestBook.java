package Test;

import java.util.Scanner;

import pkg1.Book;

public class TestBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1, "India Since Independence", "Bipin Chandra", 650);
		b1.display();
		Book b2 = new Book(2, "Indian Economy", "Vivek Singh", 350);
		b2.display();
		Book b3 = new Book();
		b3.display();
		System.out.println("-----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book id: ");
		int _id = sc.nextInt();
		System.out.println("Enter book name: ");
		String _book_name = sc.next();
		System.out.println("Enter book author: ");
		String _author = sc.next(); 
		System.out.println("Enter book price: ");
		double _price = sc.nextDouble();
		
		Book b4 = new Book();
		b4.setPrice(_price);
		b4.setAuthorName(_author);
		b4.setBookId(_id);
		b4.setBookName(_book_name);
		b4.display();
	}
}
