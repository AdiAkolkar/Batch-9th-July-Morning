package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Reporter;

public class AnnotationsStudy {
  
	
	@Test
  public void GoogleTest() 
  {
	  Reporter.log("Google test is done", true);
  }
	
	@Test
	public void RediffMailTest()
	{
		Reporter.log("Rediffmail test is done", true);
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		Reporter.log("Browser Launched-->before method executed", true);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		Reporter.log("Browser closed-->after method executed", true);
	}
  

}
