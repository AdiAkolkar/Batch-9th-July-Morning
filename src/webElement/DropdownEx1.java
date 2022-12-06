package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.id("day"));
		Thread.sleep(500);
		Select sdate=new Select(date);
		Thread.sleep(500);
		sdate.selectByIndex(9);
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(500);
		Select smonth=new Select(month);
		Thread.sleep(500);
		smonth.selectByVisibleText("Aug");
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(500);
		Select syear=new Select(year);
		Thread.sleep(500);
		syear.selectByValue("1997");
		
		
		
		

	}

}
