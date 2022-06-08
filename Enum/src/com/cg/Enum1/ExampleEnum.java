
package com.cg.Enum1;

public class ExampleEnum {
	public enum Season
	{
		WINTER,ATUMN,SPRING,SUMMER
	}
	public static void main(String[] args) {
		for(Season s: Season.values()) {
			System.out.println(s);
		}
		System.out.println("the value of atumn is: " + Season.valueOf("ATUMN"));
		System.out.println("the value of winter is "+ Season.valueOf("WINTER").ordinal());
		System.out.println("the value of summer is "+ Season.valueOf("SUMMER").ordinal());
		System.out.println("the value of sspring is "+ Season.valueOf("SPRING").ordinal());
	}
	

}
