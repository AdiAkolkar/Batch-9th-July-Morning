package other;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(1000);
		List<WebElement> search = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s:search)
		{
			System.out.println(s.getText());
			Thread.sleep(1000);
			
			String result = "Apple iPhone 13";
			
			if(result.equals(s.getText()))
			{
				s.click();
				driver.findElement(By.xpath("//a[text()='Images']")).click();
				Thread.sleep(1000);
				List<WebElement> imgCount = driver.findElements(By.tagName("img"));
				System.out.println("==========Image Count==========");
				System.out.println(imgCount.size());
				break;
				
			}
			
			
			
		}
	}

}
