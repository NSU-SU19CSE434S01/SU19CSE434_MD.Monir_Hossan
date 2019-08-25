package cse434.selenium3.test.chromedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_NG {
	
	static WebDriver driver;
	static JavascriptExecutor jse;


	@BeforeTest
	public void loadDriver() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/MDMONIRHOSSAN/Documents/CSE434/Project02/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.phptravels.net");
	}
	
	@Test
	public void testWebdriver() {
		
		//selenium.invokeBrowser();
		
		System.out.println("Webdriver test");
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		driver.close();
	}
	
}
