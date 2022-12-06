package testNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingEg1 {
	@Test(groups="regression")
	  public void TC1() 
	  {
		  Reporter.log("TC1 regression running", true);
	  }
	 
	@Test(groups="sanity")
	  public void TC2() 
	  {
		  Reporter.log("TC2 sanity running", true);
	  }
	
	@Test(groups="regression")
	  public void TC3() 
	  {
		  Reporter.log("TC3 regression running", true);
	  }
	
	@Test(groups="sanity")
	  public void TC4() 
	  {
		  Reporter.log("TC4 sanity running", true);
	  }
	
	@Test
	  public void TC5() 
	  {
		  Reporter.log("TC5 running", true);
	  }
}
