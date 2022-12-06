package other;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.goodreturns.in/gold-rates/");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Number of Rows
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@cellpadding='1'])[1]//tr"));
		System.out.println("The number of rows are "+rows.size());
		System.out.println("============================================");
		
		//Number of Columns
		List<WebElement> columns = driver.findElements(By.xpath("(//table[@cellpadding='1'])[1]//tr[1]//td"));
		System.out.println("The number of rows are "+columns.size());
		System.out.println("============================================");
		
		//Printing Data
		for(WebElement a:rows)
		{
			System.out.println(a.getText());
		}
		
	}

}
