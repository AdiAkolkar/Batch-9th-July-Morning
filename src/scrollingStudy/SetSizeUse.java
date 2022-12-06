package scrollingStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");					
		
		Dimension defaultSize = driver.manage().window().getSize();
		
		System.out.println("The default size of window is "+defaultSize);
		
		//To set size--> use Dimension class and create object of Dimension class
		
		Dimension d=new Dimension(1200, 900);
		Thread.sleep(3000);
		driver.manage().window().setSize(d);
		
		Dimension currentSize = driver.manage().window().getSize();
		
		System.out.println("The current size of window is "+currentSize);
		
		driver.manage().window().maximize();
		
		Dimension maxSize = driver.manage().window().getSize();
		
		System.out.println("Max size is "+maxSize);
		
	}

}
