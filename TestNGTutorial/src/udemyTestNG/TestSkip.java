package udemyTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	
	@Test
	public void isSkip() {
		
		throw new SkipException("Skiping the test as the condition not met");
		
	}

}
