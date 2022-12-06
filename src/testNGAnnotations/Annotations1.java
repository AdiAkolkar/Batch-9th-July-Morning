package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotations1 {
  @Test
  public void validateUserID() 
  {
	  Reporter.log("User ID validated", true);
  }
  @BeforeMethod
  public void loginToUpstox() 
  {
	  Reporter.log("Upstox login done --> Before Method Execution", true);
  }

  @AfterMethod
  public void logoutFromUpstox() 
  {
	  Reporter.log("Upstox logout done --> After Method Execution", true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("Browser Launched --> Before Class Execution", true);
  }

  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("Browser closed --> After Class Execution", true);
  }

}
