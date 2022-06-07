package FileHandles;

public class MyClass1 {
	public static void main(String[] args) {
		System.out.println(MyClass1.mymethod());
	}
 public static int mymethod()
 
 {
	 try 
	 {
		 return 0;
		 
	 }
	 finally
	 {
		 System.out.println("this is finally block");
		 System.out.println("finally block ran even after try block");
	 }
 }
}
