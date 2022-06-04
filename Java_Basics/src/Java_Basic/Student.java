package Java_Basic;

public class Student {
	int rollNo;
	 String name;
	 static String college="ROCK";
	
	Student (int rollNO,String Name){
		this.rollNo = rollNO;
		this.name = Name;
	}
	
	static void change() {
		college = "DIS";
	}
	
	 void display() {
		System.out.println(rollNo+" "+ college+" "+name);
	}
}
