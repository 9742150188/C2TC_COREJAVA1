package Keyword;
class Demo {
	
	Demo(){
		System.out.println("hello a");
	}
	Demo(int x){
		this();
		System.out.println(x);
	}

}

public class TestThis5 {
	public static void main(String[] args) {
		Demo d = new Demo(10);
	}

}
