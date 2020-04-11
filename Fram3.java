package Framwork;

import org.testng.annotations.Test;

public class Fram3 {
	@Test
	public void loginnew(){
		System.out.println("login 2");
	}
	@Test(dependsOnMethods={"loginnew"},alwaysRun=true)
	public void logoutnew(){
		System.out.println("log out 2");
	}
	@Test(enabled=false)
	public void notRun(){
		System.out.println("i will not run");
	}
	@Test(timeOut=2000)
	public void dependsOnTime(){
		System.out.println("If time to run is more than 2 sec, error will come");
	}
}
