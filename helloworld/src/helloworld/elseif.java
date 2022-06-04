package helloworld;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		int marks;
		System.out.print("enter the marks");
		Scanner A = new Scanner(System.in);
		marks=A.nextInt();
		if(marks>=60 && marks<=100)
		{
			System.out.print("first");
		}
		else if(marks>=45 && marks<60)
		{
			System.out.print("second");
		}
		else if(marks>=30 && marks<45)
		{
			System.out.print("third");
		}
		else
		{
			System.out.print("fail");
		}
		

	}

}
