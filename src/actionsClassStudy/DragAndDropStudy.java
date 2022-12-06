package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.dragAndDrop(src, dest).perform();
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.clickAndHold(src1).release(dest1).perform();

	}

}
