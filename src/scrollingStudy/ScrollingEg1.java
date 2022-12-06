package scrollingStudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");					
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// +ve x value--> right hand side, Y value +ve --> down 
		// +ve x value--> right hand side, Y value -ve --> up 
		// -ve x value--> left hand side, Y value +ve --> down 
		// -ve x value--> left hand side, Y value -ve --> up
		
		js.executeScript("window.scrollBy(1000,800)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(1000,-500)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(-500,1000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(-800,1000)");
		
		

		
		

	}

}
