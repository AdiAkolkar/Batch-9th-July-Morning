package scrollingStudy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.scrollingGeneralMethod;
import takeScreenshot.screenshotCommonMethod;

public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");					
		Thread.sleep(2000);
		
		WebElement postPaid = driver.findElement(By.xpath("//div[text()='Want it? ']"));
		
		scrollingGeneralMethod.scrollIntoView(driver, postPaid);
		
		screenshotCommonMethod.screenshot(driver, "postPaid");
		
		
		
		
		
		

	}

}
