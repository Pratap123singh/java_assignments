package pkg1;

public class Library {
	private int bookId;
	private String bookName;
	private String author;
	private double price;

	public Library() {
		this.bookId = 0;
		this.bookName = null;
		this.author = null;
		this.price = 0.0;
	}

	public Library(int bookId, String bookName, String author, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public void showDetails() {
		System.out.println();
		System.out.println("Book id: " + this.bookId);
		System.out.println("Book name: " + this.bookName);
		System.out.println("Book author: " + this.author);
		System.out.println("Book price: " + this.price);
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
		return bookName;
	}

	public void setBookAuthor(String author) {
		this.author = author;
	}

	public String getBookAuthor() {
		return this.author;
	}

	public void setBookPrice(double price) {
		this.price = price;
	}

	public double getBookPrice() {
		return this.price;
	}
}
