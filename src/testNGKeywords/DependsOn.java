package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
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
	  
	  @Test
	  public void C()
	  {
		  Reporter.log("TC C is done", true);
	  }
	  
	  @Test(dependsOnMethods = {"A","C","D"})
	  public void B() 
	  {
		  Reporter.log("TC B is done", true);
	  }
}
