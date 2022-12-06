package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
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
	  
	  @Test(timeOut = 2000)
	  public void C() throws InterruptedException 
	  {
		  Thread.sleep(5000);
		  Reporter.log("TC C is done", true);
	  }
	  
	  @Test
	  public void B() 
	  {
		  Reporter.log("TC B is done", true);
	  }
}
