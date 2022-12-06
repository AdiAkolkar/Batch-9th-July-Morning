package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedAndIsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
//		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
//		
//		System.out.println(checkBox1.isSelected());
//		
//		checkBox1.click();
//		
//		System.out.println(checkBox1.isSelected());
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		
		textBox.sendKeys("Good Evening");
		
		System.out.println(textBox.isDisplayed());
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		Thread.sleep(10000);
		hideButton.click();
		
		System.out.println(textBox.isDisplayed());
		

	}

}
