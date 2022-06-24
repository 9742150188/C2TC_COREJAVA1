package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {
	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(100, "anish");
		map1.put(201, "vittal");
		map1.put(202, "sonu");
		map1.put(203, "uchit");
		System.out.println(map1);
		for(Map.Entry<Integer,String> m:map1.entrySet()) {
			
			System.out.println(m.getKey()+"="+m.getValue());
		}
		Iterator<Integer> iterObj=map1.keySet().iterator();
		while(iterObj.hasNext()) {
			int key=iterObj.next();
			System.out.println(key +""+ map1.get(key));
		}
			
		
	}

}


