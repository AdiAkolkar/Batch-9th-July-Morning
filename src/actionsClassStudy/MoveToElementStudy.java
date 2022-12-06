package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//1.to take mouse actions, need to create object of Actions class and pass webDriver object as parameter
		
		Actions act=new Actions(driver);
		
		//Find element to be act
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		act.moveToElement(aboutus).perform();
		
		//Click on about us
		
		act.click().perform();

		

	}

}
