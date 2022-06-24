package Sets;
import java.util.SortedSet;
import java.util.TreeSet;
public class Main2 {
	public static void main(String[] args) {
		SortedSet<String> obj= new TreeSet();
		obj.add("technology");
		obj.add("quiz");
		obj.add("Code");
		obj.add("Technical");
		System.out.println("the treeset elements are"+obj);
		System.out.println("Frist"  + obj.first());
		System.out.println("Last"  + obj.last());
	}

}
