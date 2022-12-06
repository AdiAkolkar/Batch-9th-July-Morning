package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement day = driver.findElement(By.id("day"));
		
		act.click(day).perform();
		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).perform();
		
		for(int j=0; j<=1; j++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		Thread.sleep(1000);
		for(int i=0; i<=1; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
	}

}
