package Test;
import pkg1.Date;
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		d1.setDay(22);
		d1.setMonth(3);
		d1.setYear(2015);
		d1.showDate();
		System.out.println();
		Date d2 = new Date();
		d2.setDay(-5);
		d2.setMonth(13);
		d2.setYear(1456);
		d2.showDate();
	}

}
