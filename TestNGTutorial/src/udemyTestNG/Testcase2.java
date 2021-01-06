package udemyTestNG;

import org.testng.annotations.Test;

public class Testcase2 extends BaseTest {
	
	@Test(priority=1,groups= {"regression"})
	public void doLogin() {
		
		System.out.println("Executing login test");
		//Assert.fail("login failed");
	}
	
	@Test(priority=2,dependsOnMethods="doLogin")
	public void goToHomePage() {
		
		System.out.println("I am on Home Page");
	}
	
	@Test(priority=3,dependsOnMethods= {"doLogin","goToHomePage"},alwaysRun=true,groups= {"regression"})
	public void thirdTest() {
		
		System.out.println("Executing 3rd test");
	}
	
	@Test(priority=4,groups= {"regression","functional"})
	public void fourthTest() {
		
		System.out.println("Executing 4th test");
	}

}
