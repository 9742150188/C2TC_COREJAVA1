package com.cg.Enum1;

public class Main {
public enum Season
{
	WINTER,SPRING,SUMMER,AUTUMN
}
public static void main(String[] args) {
	Season s = Season.SUMMER;
	System.out.println(s);
	System.out.println(Season.SPRING);
}
}
