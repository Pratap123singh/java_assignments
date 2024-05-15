package method_overloading;

public class method_overloading {

	public void add(int no1, int no2) {
		System.out.println(no1 + no2);
	}

	public void add(int no1, double no2) {
		System.out.println(no1 + no2);
	}
	
	public void add(int no1, int no2, int no3) {
		System.out.println(no1+no2+no3);
	}
	
	public void add(double no1, int no2) {
		System.out.println(no1 + no2);
	}
	
	public void sum(int ... a) {
		int total=0;
		for(int ele: a) {
			total+=ele;
		}
		System.out.println(total);
	}
}
