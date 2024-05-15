package pkg1;

public class Point {
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoints() {
		System.out.println("X: "+ this.x);
		System.out.println("Y: "+ this.y);
	}
}
