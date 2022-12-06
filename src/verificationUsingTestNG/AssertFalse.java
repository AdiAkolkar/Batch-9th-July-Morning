package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalse {
	@Test
	  public void useFalse() 
	  {
		  boolean a=false;
		  
		  Assert.assertFalse(a, "a is true TC is failed");
		  Reporter.log("a is false TC is passed", true);
	  }
	  
	  @Test
	  public void useFalse1() 
	  {
		  boolean a=true;
		  
		  Assert.assertFalse(a, "a is true TC is failed");
		  Reporter.log("a is false TC is passed", true);
	  }
}
