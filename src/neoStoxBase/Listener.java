package neoStoxBase;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxUtility.neoStoxUtilityNew;

public class Listener extends neoStoxBaseNew implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC "+result.getName()+" passed successfully.", true);
	}
	
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC "+result.getName()+" failed.", true);
		
		try 
		{
			neoStoxUtilityNew.screenshot(driver, result.getName());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
