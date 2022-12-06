package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTesting {
  @Test			//TC //TestMethod
  public void upstoxLoginTest() 
  {
	  	System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Hi upstox is launched");					//Prints message only in console window
		
		Reporter.log("Hi Upstox login page is working fine");			//Prints message only in emailable report
		
		Reporter.log("Hi Upstox", true);								//Prints message in both console window and emailable report
		
		driver.get("https://login-v2.upstox.com/");
  }
  
  @Test
  public void GoogleTest()
  {
	  System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Hi google is launched");
		
		Reporter.log("Hi Google Page is working fine");
		
		Reporter.log("Hi Google", true);
		
		driver.get("https://google.co.in/");

  }
  
}
