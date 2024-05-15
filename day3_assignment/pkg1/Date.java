package pkg1;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public void setDay(int dd) {
		if (1<= dd && dd <= 31)
			this.dd=dd;
		else
			System.out.println("Invalid day. Please enter correct day");
	}
	
	public int getDay() {
		return this.dd;
	}
	
	public void setMonth(int mm) {
		if (1<= mm && mm <= 12)
			this.mm = mm;
		else
			System.out.println("Invalid month. Please enter correct month");
	}
	
	public int getMonth() {
		return this.mm;
	}
	
	public void setYear(int yy) {
		this.yy = yy;
	}
	
	public int getYear() {
		return yy;
	}
	
	public void showDate() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}
