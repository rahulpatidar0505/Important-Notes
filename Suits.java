package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Suits {
	@BeforeSuite
	public void Beforesuit(){
		System.out.println("I am the first");
	}
	@AfterSuite
	public void Aftersuit(){
		System.out.println("I am the last");
	}
}
