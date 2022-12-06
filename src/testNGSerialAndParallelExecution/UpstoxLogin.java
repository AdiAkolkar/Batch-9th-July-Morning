package testNGSerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UpstoxLogin {
	@Test
	  public void Upstox() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://login-v2.upstox.com/");
			
			Reporter.log("Upstox Launch",true);
			
			Thread.sleep(2000);
			
			driver.close();
			
			
	  }
}
