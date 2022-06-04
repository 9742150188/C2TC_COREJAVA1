package Java_Basic;

public class StaPro {
	public static void main(String[] args) {
		
		Student s1 = new Student(111,"Troy");
		Student s2 = new Student(112,"Joy");
		Student.change();
		s1.display();
		s2.display();
		
	}
}

