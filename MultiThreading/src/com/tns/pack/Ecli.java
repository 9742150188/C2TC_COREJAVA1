package com.tns.pack;
class ec extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("eclipse Thread id is "+Thread.currentThread().getId());
			try {
				sleep(1000);
			}
			catch(Exception f)
			{
				System.out.println(f);
			}
		}
	}
}
public class Ecli {
	public static void main(String[] args) {
		ec obj = new ec();
		obj.start();
		
	}

}
