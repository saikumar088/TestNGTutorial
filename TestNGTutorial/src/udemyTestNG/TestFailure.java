package udemyTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure  extends BaseTest{
	
	@Test
	public void negative() {
		
		Assert.fail("Failing the test");
		System.out.println("Capture screen shot");
		
	}

}
