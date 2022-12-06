package testNGSerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GrowwLogin {
  @Test
  public void Groww() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		
		Reporter.log("Groww Launch",true);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
  }
}
