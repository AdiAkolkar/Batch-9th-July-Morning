package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links");					
		Thread.sleep(1000);
		
		//Get Id of main page
		String mainPageId = driver.getWindowHandle();
		System.out.println(mainPageId);
		Thread.sleep(1000);
		
		//Open new window
		driver.findElement(By.name("NewWindow")).click();
		
		// now main page along with child/ new window will be available 
		// to get all page ID's use getWindowHandles() method which will return you set of String
		
		Set<String> allPageId = driver.getWindowHandles();
		
		for(String a:allPageId)
		{
			System.out.println(a);
		}
		
		// to get desired page id use iterator and use next method to move ahead
		
		Iterator<String> it = allPageId.iterator();
		
		String mainPageIdNew = it.next();							//Store id in ref variable
		String childPageId = it.next();								//Store id in ref variable
		
		Thread.sleep(3000);
		System.out.println(mainPageIdNew);
		
		System.out.println(childPageId);
		
		driver.switchTo().window(childPageId);						//switching selenium focus from main page to child page
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.close();
		driver.quit();
		
		
		
		

	}

}
