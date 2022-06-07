package FileHandles;

public class ExceClass {
	public static void main(String2[] args) {
		ExceClass obj = new ExceClass();
		obj.display();
	}
   public void display()
   {
	   try
	   {
	   System.out.println(100/0);
	   }
	   catch(ArithmeticException ex)
	   {
		   System.out.println("this is Arithematic expresion");
	  
   }
   }
}
