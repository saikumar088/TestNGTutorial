package udemyTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 extends BaseTest {
	
	@Test(priority=1,groups="functional")
	public void doLogin() {
		
		System.out.println("Executing login test");
	}
	
	@Test(priority=2,groups="functional")
	public void goToHomePage() {
		
		System.out.println("I am on Home Page");
	}
	
	@BeforeMethod
	public void Setup() {
		
		System.out.println("browser setup");
	}
	
	@AfterMethod
	public void tearDown() {
		
		System.out.println("Closing browser");
	}
	
	@BeforeTest
	public void SetUpDataBase() {
		
		System.out.println("Database setup");
	}
	
	@AfterTest
	public void closeDatabase() {
		
		System.out.println("Closing Database connection");
	}

}
