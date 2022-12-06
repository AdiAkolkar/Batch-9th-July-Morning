package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void TC1() 
  {
	  String a="ABC";
	  
	  Assert.assertNull(a, "a value is not null TC is failed");
	  Reporter.log("a is null TC is passed", true);
  }
  
  @Test
  public void TC2() 
  {
	  String a=null;
	  
	  Assert.assertNull(a, "a value is not null TC is failed");
	  Reporter.log("a is null TC is passed", true);
  }
}
