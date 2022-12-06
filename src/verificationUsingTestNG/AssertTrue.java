package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void useTrue() 
  {
	  boolean a=true;
	  
	  Assert.assertTrue(a, "a is false TC is failed");
	  Reporter.log("a is true TC is passed", true);
  }
  
  @Test
  public void useTrue1() 
  {
	  boolean a=false;
	  
	  Assert.assertTrue(a, "a is false TC is failed");
	  Reporter.log("a is true TC is passed", true);
  }
}
