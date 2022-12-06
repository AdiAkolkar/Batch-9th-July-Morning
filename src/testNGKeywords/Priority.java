package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority =-10)
  public void A() 
  {
	  Reporter.log("TC A is done", true);
  }
 
  @Test(priority = -8)
  public void D() 
  {
	  Reporter.log("TC D is done", true);
  }
  
  @Test(priority = 0)
  public void C() 
  {
	  Reporter.log("TC C is done", true);
  }
  
  @Test(priority =-5)
  public void B() 
  {
	  Reporter.log("TC B is done", true);
  }
}
