package com.cg.Enum1;
import com.cg.Enum1.ExampleEnum.Season;
public class Example {
	public enum Season{
		SUMMER(5),WINTER(10),SPRING(15),ATUMN(20);
		int value;
		Season(int value){
			this.value = value;
			
			
		}
		
	}
	
	public static void main(String[] args) {
		for(Season s: Season.values()) {
			System.out.println(s+" "+s.value);
		}
	}
	

}
