package helloworld;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		int n;
		//3int i;
		System.out.println("enter the numbers");
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		
		for(int i=1; i<=100; i++)
		{
			System.out.println(n*i);
		}

	}

}
