package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeMethod
	public void runbeforealltest(){
		System.out.println("run before all the test");
	}
	
	@AfterMethod
	public void runafteralltest(){
		System.out.println("run after all the test");
	}
	@BeforeTest
	public void runbefore(){
		System.out.println("Before the test once");
	}
	@AfterTest
	public void runafter(){
		System.out.println("After the test once");
	}
	
	@Test
	public void OpenBrowser(){
		System.out.println("Open the browser");
	}
	
	@Test(timeOut=5000)
	public void OpenBrows(){
		System.out.println("/..........Open the browser");
	}
	
	
	@Test(dependsOnMethods={"OpenBrowser"},alwaysRun=true)
	public void Login(){
		System.out.println("Enter the details");
	}
	
	@Test(enabled=false)
	public void Open(){
		System.out.println("Open the browser...........");
	}
}
