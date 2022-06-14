package com.tns.pack;

class eclipse1 implements Runnable{
	public void run() {
		//for( int i=0;i<5;i++) {
			
		
		System.out.println("eclipse Thread Id is " + Thread.currentThread().getId());
		System.out.println("eclipse Thread  priority is " + Thread.currentThread().getPriority());
		}
	}
//}

class Ppt1 implements Runnable{
	public void run() {
		//for( int i=0;i<5;i++) {
		System.out.println("Ppt Thread Id is " + Thread.currentThread().getId());
		System.out.println("eclipse Thread  priority is " + Thread.currentThread().getPriority());
		
	}
}
//}
class NotePad1 implements Runnable{
	public void run() {
		//for( int i=0;i<5;i++) {
		System.out.println("NotePd Thread Id is " + Thread.currentThread().getId());
		System.out.println("eclipse Thread  priority is " + Thread.currentThread().getPriority());
		
	}
	}
//}

public class MultiThread2 {
	public static void main(String[] args) {
		eclipse1 obj1 = new eclipse1();
		Thread t=new Thread(obj1);
		t.start();
		t.setPriority(6);
		Ppt1 obj2= new Ppt1();
		Thread t1=new Thread(obj2);
		t1.start();
		t1.setPriority(7);
		NotePad1 obj3 =new NotePad1();
		Thread t2=new Thread(obj3);
		t2.start();
		t2.setPriority(6);
				
		
		
	}

}
