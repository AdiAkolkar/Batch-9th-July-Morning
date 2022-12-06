package iFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE TESTING\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");					
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");																	//switch to parent frame
		Thread.sleep(1000);
		String parentFrameText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println("The parent frame's text is "+parentFrameText);
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));	//switch to child frame
		Thread.sleep(1000);
		String childFrameText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println("The child frame's text is "+childFrameText);
		Thread.sleep(1000);
//		String parentText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
//		System.out.println(parentFrameText);
		
		
		
//		driver.switchTo().parentFrame();
//		String parentText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();		//Again switch to parent frame
//		System.out.println("The parent frame's text is "+parentText);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Frames']")).click();									//Switch to main page
		
	}

}
