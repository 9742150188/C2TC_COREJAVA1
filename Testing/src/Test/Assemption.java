package Test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assemption {
	
	@Test
	void testDrive() {
		System.setProperty("enn", "Dev");
		Assumptions.assumeTrue("Dev".equals(System.getProperty("enn")));
	}
	@Test
	void testDrive2() {
		System.setProperty("ss", "hhh");
		Assumptions.assumeTrue("Dev".equals(System.getProperty("ss")));
		
	}
	static String message() {
		return "Test Execution Failed";
	}

}