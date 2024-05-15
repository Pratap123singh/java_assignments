package Test;
import pkg1.Book1;

public class TestBook1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1 = new Book1();
		b1.setAuthor("Daniel Goleman");
		//System.out.println(b1.getAuthor());
		b1.setBookId(12345);
		b1.setBookName("Emotional Intelligence");
		b1.setPrice(350);
		b1.displayBookdetails();
	}

}
