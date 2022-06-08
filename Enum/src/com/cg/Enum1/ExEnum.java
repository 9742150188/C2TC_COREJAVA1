package com.cg.Enum1;

public class ExEnum {
  enum Day{
	  SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY, FRIDAY,SATURDAY
  }
  public static void main(String[] args) {
	  Day day = Day.FRIDAY;
	  switch(day) {
	  case SUNDAY:
	  System.out.println("moving towards monday");
	  break;
	  case FRIDAY:
		  System.out.println("its the weekand");
		  break;
		  default:
			  System.out.println("other day");
		  
	  
	  }
  }
}
