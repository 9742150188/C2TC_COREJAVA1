package Sets;
import java.util.LinkedHashSet;
public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet link=new LinkedHashSet();
		link.add("vittal");
		link.add("pass");
		link.add("sonu");
		link.add("anish");
		Object[] a= link.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
