package Sets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class HashSet4 {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);//user input
		System.out.println("enter the values");
		Set<String>s=new HashSet<String>();//here we are using string for getting string value
		
		for(int i=0;i<4;i++) {//here we are giving the size of the string
			s.add(obj.nextLine());//here we are adding the string values
		}
		System.out.println(" values are :"+s);
		
		System.out.println("the size is : " +s.size()); 
		
	}
}
