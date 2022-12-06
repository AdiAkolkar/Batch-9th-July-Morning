package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	  public void A() 
	  {
		  Reporter.log("TC A is done", true);
	  }
	 
	  @Test
	  public void D() 
	  {
		  Reporter.log("TC D is done", true);
	  }
	  
	  @Test(enabled = false)
	  public void C()
	  {
		  Reporter.log("TC C is done", true);
	  }
	  
	  @Test
	  public void B() 
	  {
		  Reporter.log("TC B is done", true);
	  }
}
