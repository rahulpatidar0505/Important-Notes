package TestNG;

import org.testng.annotations.Test;

public class Login {
	@Test(groups={"Priority1"})
	public void UserID(){
		System.out.println("Enter userid");
	}
	@Test(groups={"Priority2"})
	public void Password(){
		System.out.println("Enter Password");
	}
}
