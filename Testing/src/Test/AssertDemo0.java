package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
 
@Disabled
public class AssertDemo0 {
	@Test
  public void Simple() {
    int result=1;
    int expected=1;
    assertEquals(result,expected);
	  
  }@Test
	public void Simple1() {
	    int result=1;
	    int expected=2;
	    assertEquals(result,expected);
		  
}@Disabled
  @Test
	public void Simple2() {
	    int result=1;
	    int expected=3;
	    assertEquals(result,expected);
		  
}
}