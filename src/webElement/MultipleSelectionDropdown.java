package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement multiselection = driver.findElement(By.id("cars"));
		Thread.sleep(500);
		
		Select smulti=new Select(multiselection);
		
		System.out.println(smulti.isMultiple());
		
		//Select Methods
		smulti.selectByIndex(3);
		Thread.sleep(500);
		smulti.selectByVisibleText("Saab");
		Thread.sleep(500);
		smulti.selectByValue("volvo");
		Thread.sleep(500);
		
		//Deselect Methods
//		smulti.deselectByIndex(3);
//		Thread.sleep(500);
//		smulti.deselectByVisibleText("Saab");
//		Thread.sleep(500);
//		smulti.deselectByValue("volvo");
		
		//SelectAll Method
		smulti.deselectAll();

	}

}
