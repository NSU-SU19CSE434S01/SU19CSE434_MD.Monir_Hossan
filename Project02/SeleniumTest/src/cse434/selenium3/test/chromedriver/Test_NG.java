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
	
	@Test(priority=1)
	public void signUp() {
		
		try {

			driver.get("https://www.phptravels.net/register");
			
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/input")).sendKeys("Md Monir");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/input")).sendKeys("Hossan");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/input")).sendKeys("01782345064");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input")).sendKeys("monir@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/input")).sendKeys("123456");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/input")).sendKeys("123456");
			Thread.sleep(1000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,200)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();
			Thread.sleep(1000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,-500)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input")).sendKeys("mdmonirh@gmail.com");
			Thread.sleep(1000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,200)");
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();
			Thread.sleep(3000);
			
			driver.get("https://www.phptravels.net/account/logout"); 
			
//			Select select = new Select(driver.findElement(By.cssSelector("body > nav > div > div.collapse.navbar-collapse > ul.nav.navbar-nav.navbar-right.hidden-sm.go-left > ul > li:nth-child(1) > a")));
//			Thread.sleep(1000);
//			select.selectByIndex(1);
//			Thread.sleep(1000);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void logIn() {
		
		try {
			driver.get("https://www.phptravels.net/login");
			
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys("monir@gmail.com");
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
	
	
	
}
