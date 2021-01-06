package udemyTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	@BeforeSuite
	public void setUp() {

		System.out.println("Intializing driver!!!!");
	}
	
	
	@AfterSuite
	public void tearDown() {

		System.out.println("Quitting Everything!!!!");
	}


}
