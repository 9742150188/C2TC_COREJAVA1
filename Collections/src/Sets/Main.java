package Sets;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Set obj=new HashSet();
		obj.add("vittal");
		obj.add("sonu");
		obj.add("vittal");
		obj.add(20);
		obj.add(null);
		System.out.println(obj);
		
	}

}
