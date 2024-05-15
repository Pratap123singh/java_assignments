package Test;
import pkg1.Student;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.acceptInfo(1, 50.2, 20.75, 70.2);
		s1.display();
		s1.displayTotal();
		s1.displayPercentage();
		s1.displayGrade();
	}

}
