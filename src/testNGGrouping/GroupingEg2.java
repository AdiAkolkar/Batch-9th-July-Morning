package testNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingEg2 {
	@Test
	  public void TC6() 
	  {
		  Reporter.log("TC6 regression running", true);
	  }
	 
	@Test(groups="sanity")
	  public void TC7() 
	  {
		  Reporter.log("TC7 sanity running", true);
	  }
	
	@Test(groups="regression")
	  public void TC8() 
	  {
		  Reporter.log("TC8 regression running", true);
	  }
	
	@Test(groups="sanity")
	  public void TC9() 
	  {
		  Reporter.log("TC9 sanity running", true);
	  }
	
	@Test
	  public void TC10() 
	  {
		  Reporter.log("TC10 running", true);
	  }
}
