package Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(null);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(11);
		list.add(11);
		list.add(100);
		for(Integer i: list) {
			System.out.println(i);
		}
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j));
			
		}
		Iterator<Integer> z = list.iterator();
		while(z.hasNext()) {
			System.out.println(z.next());
		}
	}
	

}
