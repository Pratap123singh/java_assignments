package pkg1;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private double price;

	// non-parameterized constructor
	public Book() {
		this.bookId = 0;
		this.bookName = null;
		this.author = null;
		this.price = 0.0;

	}

	// parameterized constructor
	public Book(int bookId, String bookName, String author, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public int getBookId() {
		return this.bookId;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public void setAuthorName(String author) {
		this.author = author;
	}
	
	public String getAuthorName() {
		return this.author;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void display() {
		System.out.println("Book id: " + this.bookId);
		System.out.println("Book Name: " + this.bookName);
		System.out.println("Author Name: " + this.author);
		System.out.println("Pice: " + this.price);
	}
}
