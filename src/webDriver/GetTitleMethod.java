package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://groww.in/");					
		Thread.sleep(1000);
		
		//System.out.println(driver.getTitle());			//WebDriver getTitle Method
		
		String Title=driver.getTitle();
		System.out.println("The title of grow website is "+Title);
		
		

	}

}
