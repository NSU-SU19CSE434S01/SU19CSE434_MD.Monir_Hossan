package cse434.selenium3.test.chromedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		
		try {
			driver.get("https://www.phptravels.net/login");
			
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys("mdmonir@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("123456");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/label")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
			

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		try {
			Thread.sleep(3000);
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
