package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNull {
	@Test
	  public void TC1() 
	  {
		  String a="ABC";
		  
		  Assert.assertNotNull(a, "a value is null TC is failed");
		  Reporter.log("a is not null TC is passed", true);
	  }
	  
	  @Test
	  public void TC2() 
	  {
		  String a=null;
		  
		  Assert.assertNotNull(a, "a value is null TC is failed");
		  Reporter.log("a is not null TC is passed", true);
	  }
}
