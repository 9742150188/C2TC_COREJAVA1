package FileHandles;

public class Exception {

	public static void main(String2[] args) {
		Exception ob = new Exception();
		try 
		{
			ob.math1();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception thrown by math1() mrthod caught in main() method");
		}
	}
	public void math1() 
	{
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException nullExp)
		{
			System.out.println("we have an exception -"+nullExp);
		}
		System.out.println("outside try-catch block");
	}
}
