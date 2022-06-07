package FileHandles;
import java.io.FileInputStream;

import java.io.IOException;

public class Main {
	public static void main (String2[] args) throws IOException {
	FileInputStream fis = null;
	
	
	fis = new FileInputStream("C:\\Users\\vitta\\Documents\\MyClass.txt");
	int k;
	
	
	while((k=fis.read()) != -1) 
		System.out.print((char)k);
	
	
		
      fis.close();
	

}
}