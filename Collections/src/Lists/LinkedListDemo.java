package Lists;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList <String> names =new LinkedList<>();
		names.add("ravi");
		names.add("vittal");
		names.add("sonu");
		names.add("anish");
		names.add(null);
		names.addFirst("vittal");
		names.addLast("sonu");
		System.out.println("name is"+names);
	}

}
