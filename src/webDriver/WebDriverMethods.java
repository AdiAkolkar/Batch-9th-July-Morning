package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://groww.in/");					//WebDriver get method.
		Thread.sleep(1000);
		
		driver.manage().window().maximize();				//WebDriver Maximize Method
		Thread.sleep(1000);
		
		driver.navigate().to("https://kite.zerodha.com/");	//WebDriver Navigate Method
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().to("https://login.upstox.com/");
		Thread.sleep(1000);
	
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.manage().window().minimize();				//WebDriver Minimize Method
		Thread.sleep(1000);
		
		driver.close();										//WebDriver Close Method
		
		//driver.quit();									//WebDriver Quit Method

		
		
		
		

	}

}
