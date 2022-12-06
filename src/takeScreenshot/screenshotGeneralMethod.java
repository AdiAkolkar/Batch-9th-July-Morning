package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotGeneralMethod {
	
	public static void screenshotMethod(WebDriver driver, String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("H:\\SOFTWARE TESTING\\AUTOMATION TESTING\\SELENIUM\\Screenshots\\screenshot.png");
		
		FileHandler.copy(src, dest);
	}

}
