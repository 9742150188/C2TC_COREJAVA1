package Lists;
import java.util.LinkedList;
public class LinkedListHeteroDemo {
	public static void main(String[] args) {
		LinkedList List =new LinkedList<>();
		List.add("raj");
		List.add(2);
		List.add("vittal");
		List.add(5);
		System.out.println(((LinkedList)List).offer("sanjay"));
		System.out.println(List);
	}

}
