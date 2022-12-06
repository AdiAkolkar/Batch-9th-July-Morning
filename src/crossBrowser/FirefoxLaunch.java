package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxLaunch {
  @Test
  public void f() 
  {
	System.setProperty("webdriver.gecko.driver", "H:\\SOFTWARE TESTING\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://login-v2.upstox.com/");
  }
}
