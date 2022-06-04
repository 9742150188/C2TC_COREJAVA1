package Java_Basic;

public class Cricket {
	String name = "Dhoni";
	int age = 39;
	String color = "Brown";
	String role = "Batsman";
	String nationality ="Indian";
	
	void display() {
		System.out.println("I Love Cricket");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Cricket c = new Cricket();
		c.display();
		System.out.println("main method end");
	}


}
