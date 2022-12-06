package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTC {
  @Test
  public void verifyCheckBox() 
  {
	  System.setProperty("webdriver.chrome.driver", "H:\\\\SOFTWARE TESTING\\\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
	  
	  checkBox1.click();
	  
	  Assert.assertTrue(checkBox1.isSelected(), "CheckBox1 is not selected TC is failed");
	  
	  
  }
}
