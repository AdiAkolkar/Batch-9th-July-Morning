package testNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingEg3 {
	@Test(groups = "funds")
	 public void F() 
	 {
		Reporter.log("F TC running", true);
	 }
	
	@Test(groups = "homePage")
	 public void G() 
	 {
		Reporter.log("G TC running", true);
	 }
	
	@Test(groups = "funds")
	 public void H() 
	 {
		Reporter.log("H TC running", true);
	 }
	
	@Test(groups = "homePage")
	 public void I() 
	 {
		Reporter.log("I TC running", true);
	 }
	
	@Test(groups = "homePage")
	 public void J() 
	 {
	 Reporter.log("J TC running", true);
	 }
}
