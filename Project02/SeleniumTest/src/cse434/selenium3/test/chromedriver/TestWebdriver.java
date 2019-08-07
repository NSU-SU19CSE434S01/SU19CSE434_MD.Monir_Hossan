package cse434.selenium3.test.chromedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebdriver {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		TestWebdriver test = new TestWebdriver();
		test.invokeBrowser();
		
		
	}
	
	public void invokeBrowser() {

		
		try {
			System.setProperty("webdriver.chrome.driver", "/Users/MDMONIRHOSSAN/Documents/CSE434/Project02/chromedriver");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://google.com");
			
			setInputField();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	
	public static void setInputField() {
		
		try {
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("7 website for selenium testing");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
