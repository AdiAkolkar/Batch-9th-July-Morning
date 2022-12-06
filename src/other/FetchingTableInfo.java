package other;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingTableInfo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("Number of rows present in table "+rows.size());
		Thread.sleep(1000);
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//tr//th"));
		System.out.println("Number of columns present in table "+columns.size());
		Thread.sleep(1000);
		
		System.out.println("=================Table Value=================");
		List<WebElement> tableText = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		for(WebElement a:tableText)
		{
			System.out.println(a.getText());
		}
	}

}
