package pkg1;

public class Book1 {
	private String bname;
	private int id;
	private String author;
	private double price;
	
	public void setBookName(String bname) {
		this.bname = bname;
	}
	public String getBookName() {
		return this.bname;
	}
	public void setBookId(int id) {
		this.id = id;
	}
	public int getBookId() {
		return this.id;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return this.price;
	}
	public void displayBookdetails() {
		System.out.println("Book name: " + bname);
		System.out.println("Book id: " + id);
		System.out.println("Book author: " + author);
		System.out.println("Book price: " + price);
	}
	
}
