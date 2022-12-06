package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
	@Test
	  public void TC1() 
	  {
		  String a="Yavatmal";
		  String b="yavatmal";
		  
		  Assert.assertNotEquals(a,b, "a and b are matching TC is failed");
		  Reporter.log("a and b are not matching TC is passed", true);
	  }
}
