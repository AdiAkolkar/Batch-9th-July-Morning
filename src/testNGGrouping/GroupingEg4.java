package testNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingEg4 {
	@Test(groups = "homePage") //"funds"})
	 public void A() 
	 { 
		Reporter.log("A TC running", true);
	 }
	
	@Test(groups = "funds")
	 public void B() 
	 {
		//Assert.fail();
		Reporter.log("B TC running", true);
	 }
	
	@Test(groups = "homePage")
	 public void C() 
	 {
		Reporter.log("C TC running", true);
	 }
	
	@Test(groups = "funds")
	 public void D() 
	 {
		Reporter.log("D TC running", true);
	 }
	
	@Test(groups = "homePage")
	 public void E() 
	 {
		Reporter.log("E TC running", true);
	 }
}
