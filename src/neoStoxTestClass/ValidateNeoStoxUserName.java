package neoStoxTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.neoStoxBaseNew;
import neoStoxPOM.neoStoxHomePage;
import neoStoxPOM.neoStoxLoginPage;
import neoStoxPOM.neoStoxPasswordPage;
import neoStoxUtility.neoStoxUtilityNew;

@Listeners(neoStoxBase.Listener.class)

public class ValidateNeoStoxUserName extends neoStoxBaseNew
{
	neoStoxLoginPage login;
	neoStoxPasswordPage password;
	neoStoxHomePage home;
	
	@BeforeClass
	public void launchNeoStox() throws IOException
	{
		launchBrowser();
		login=new neoStoxLoginPage(driver);
		password=new neoStoxPasswordPage(driver);
		home=new neoStoxHomePage(driver);
	}
	
	@BeforeMethod
	public void signInToNeoStox() throws IOException, InterruptedException
	{
		login.enterMobileNumber(driver, neoStoxUtilityNew.readPropertyFile("mobNum"));
		login.clickOnSignInButton(driver);
		Thread.sleep(1000);
		password.enterPassword(driver, neoStoxUtilityNew.readPropertyFile("password"));
		password.clickOnSubmitButton(driver);
		Thread.sleep(1000);
		home.handlePopUp(driver);
	}

  @Test
  public void validateUserName() throws IOException 
  {
	  Assert.assertEquals(home.getUserName(), neoStoxUtilityNew.readPropertyFile("expUserName"), "TC failed, actual and expected username are not matching");
	  
  }
  
  @AfterMethod
  public void logoutFromNeoStox()
  {
	  home.logoutFromApplication(driver);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
