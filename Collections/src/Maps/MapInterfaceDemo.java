package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {
	public static void main(String[] args) {
		Map<String,String> map1 =new HashMap<>();
		map1.put("first", "prof");
		map1.put("virr", "sonu");
		map1.put("500", "anish");
		map1.put("third", "tokyo");//  keys are unique values are duplicate
		map1.put("third1", "tokyo");
		System.out.println(map1.get("third"));//use to get value,cannot give the value
	}

}
