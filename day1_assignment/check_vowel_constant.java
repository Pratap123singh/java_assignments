package day1_assignment;

import java.util.Scanner;

public class check_vowel_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String ch = sc.next();
		System.out.println(ch.getClass());
		if (ch.equals("a") || ch.equals("e") || ch.equals("i")|| ch.equals("o") || ch.equals("u")) {
			System.out.println("it's a vowel");
		} else {
			System.out.println("it's a consonant");
		}
	}
}
