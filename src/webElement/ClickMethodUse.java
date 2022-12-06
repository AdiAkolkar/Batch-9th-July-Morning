package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://groww.in/");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login_email1")).sendKeys("adityaakolkar10@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login_password1")).sendKeys("Akolkar@10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		

	}

}
