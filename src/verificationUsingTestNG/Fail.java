package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail {
  @Test
  public void TC1() 
  {
	 Assert.fail();
	  Reporter.log("Aditya Ashok Akolkar");
  }
}
