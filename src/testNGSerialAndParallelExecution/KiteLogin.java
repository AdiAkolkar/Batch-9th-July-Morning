package testNGSerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KiteLogin {
	@Test
	  public void Kite() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
			
			Reporter.log("Kite Launch",true);
			
			Thread.sleep(2000);
			
			driver.close();
			
			
	  }
}
