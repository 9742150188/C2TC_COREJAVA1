package com.tns.pack;
class eclipse extends Thread{
	public void run() {
		for( int i=0;i<5;i++) {
		System.out.println("eclipse Thread Id is " + Thread.currentThread().getId());
		
	}
	}
}

class Ppt extends Thread{
	public void run() {
		for( int i=0;i<5;i++) {
		System.out.println("Ppt Thread Id is " + Thread.currentThread().getId());
		
	}
	}
}
class NotePad extends Thread{
	public void run() {
		for( int i=0;i<5;i++) {
		System.out.println("NotePd Thread Id is " + Thread.currentThread().getId());
		}
	}
}

public class MultiThread {
	public static void main(String[] args) {
		eclipse obj1 = new eclipse();
		obj1.start();
		Ppt obj2= new Ppt();
		obj2.start();
		NotePad obj3 =new NotePad();
		obj3.start();
				
		
		
	}

}
