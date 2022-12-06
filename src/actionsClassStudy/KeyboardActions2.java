package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement username = driver.findElement(By.name("email"));
		
		//act.keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("ditya").perform();
		
		act.sendKeys("adityaakolkar10").keyDown(Keys.SHIFT).keyDown(Keys.NUMPAD2).keyUp(Keys.NUMPAD2).keyUp(Keys.SHIFT).sendKeys("gmail.com").perform();
		
		

	}

}
