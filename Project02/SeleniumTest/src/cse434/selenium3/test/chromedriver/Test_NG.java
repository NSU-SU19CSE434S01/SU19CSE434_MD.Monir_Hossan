package cse434.selenium3.test.chromedriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_NG {
	
	TestWebdriver selenium = new TestWebdriver();

	@BeforeTest
	public void loadDriver() {
		System.out.println("Before Test");
	}
	
	@Test
	public void testWebdriver() {
		
		selenium.invokeBrowser();
		
		System.out.println("Webdriver test");
	}
	
	
}
