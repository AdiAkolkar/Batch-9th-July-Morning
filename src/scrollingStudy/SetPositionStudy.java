package scrollingStudy;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		Point defaultPosition = driver.manage().window().getPosition();
		
		System.out.println("The default position is "+defaultPosition);
		
		//To set position--> use point class and create object of point class
		
		Point p=new Point(50, 250);
		
		driver.manage().window().setPosition(p);
		
		Point currentPosition = driver.manage().window().getPosition();
		
		System.out.println("The current position is "+currentPosition);
		

	}

}
