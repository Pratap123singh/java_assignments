package java_practice;

public class Test {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		
		int add = a + b;
		
		System.out.println("Add = " + add);				//output----> Add = 30
		System.out.println(a+b);						//output----> 30
		System.out.println("Add = " + a + b);			//output----> Add = 1020
		System.out.println("Add = " + ( a + b ));		//output----> Add = 30
	}
}

