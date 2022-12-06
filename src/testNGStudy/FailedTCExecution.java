package testNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTCExecution {
	@Test(timeOut=1000)
	  public void A() throws InterruptedException 
	  {
		  Thread.sleep(2000);
		  Reporter.log("TC A is done", true);
	  }
	 
	  @Test
	  public void B() 
	  {
		  Reporter.log("TC B is done", true);
	  }
	  
	  @Test
	  public void C()
	  {
		  Assert.fail();
		  Reporter.log("TC C is done", true);
	  }
	  
	  @Test
	  public void D() 
	  {
		  Reporter.log("TC D is done", true);
	  }
	  
	  @Test
	  public void E() 
	  {
		  Reporter.log("TC E is done", true);
	  }
}
