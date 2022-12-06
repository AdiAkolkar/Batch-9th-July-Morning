package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	SoftAssert soft=new SoftAssert();
  @Test
  public void softAssertEquals() 
  {
	  String a="Aditya Akolkar";
	  String b="Aditya Akolkar";
	  
	  soft.assertEquals(a,b, "a and b are not equal TC is failed");
	  soft.assertAll();
  }
}
