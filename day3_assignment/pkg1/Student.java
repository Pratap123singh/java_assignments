package pkg1;
import java.lang.Math;
public class Student {
	private int rollno;
	private double marks1;
	private double marks2;
	private double marks3;
	private double percentage;
	private double total;
	
	public void acceptInfo(int rollno, double marks1, double marks2, double marks3) {
		this.rollno=rollno;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	public void display() {
		System.out.println("Rollno: " + rollno+ " marks1: "+ marks1+ " marks2: "+ marks2+" marks3: "+ marks3);
	}
	
	public void displayTotal() {
		double r = this.marks1 + this.marks2 + this.marks3;
		//this.total = Math.floor(r);
		this.total = Math.floor(r * 100)/100;
		System.out.println("Total marks: " + this.total);
	}
	
	public void displayPercentage() {
		double per = (this.marks1+this.marks2+this.marks3)/3;
		//System.out.println(Math.floor(47.05*100)/100);
		this.percentage = Math.floor(per * 100)/100;
		System.out.println("Total percentage: " + percentage + "%");
	}
	
	public void displayGrade() {
		if (percentage > 60) {
			System.out.println("Grade: A");
		}
		else if(40 < percentage && percentage <=60) {
			System.out.println("Grade: B");
		}
		else {
			System.out.println("Grade: C");
		}
	}
}
