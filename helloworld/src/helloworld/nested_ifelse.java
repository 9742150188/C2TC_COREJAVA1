package helloworld;

public class nested_ifelse {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.print("a greater");
			}
			else
			{
				System.out.print("c greater");
			}
		}
		else {
				if(b>c)
				{
					System.out.print("b greater");	
				}
				else
				{
					System.out.print("c greater");
				}
			}

	}

}
