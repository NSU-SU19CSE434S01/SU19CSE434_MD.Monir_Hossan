package cse434.selenium3.test.chromedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestWebdriver {
	
	static WebDriver driver;
	
	static JavascriptExecutor jse;

	public static void main(String[] args) {
		
		TestWebdriver test = new TestWebdriver();
		test.invokeBrowser();
		
		
	}
	
	public void invokeBrowser() {

		
		try {
			System.setProperty("webdriver.chrome.driver", "/Users/MDMONIRHOSSAN/Documents/CSE434/Project02/chromedriver");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.phptravels.net");
			
			setInputField();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	
	public static void setInputField() {
		
		try {
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[3]/a")).click();
			Thread.sleep(3000);
			
//			jse = (JavascriptExecutor)driver;
//			jse.executeScript("scroll(0,100)");
//			Thread.sleep(2000);
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div")).click();
//			Thread.sleep(1000);
			
			//Alert alert = new WebDriverWait(driver, 20).until(ExpectedConditions.alertIsPresent());
//			alert.accept();
			
//			driver.findElement(By.id("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Dubai");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[18]/div/input")).sendKeys(Keys.RETURN);
			
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"s2id_destination\"]/a/span[1]")).click();
//			driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("washington");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.RETURN);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tchkin\"]/div/input")).click();
			//driver.findElement(By.xpath("//*[@id=\"departure\"]")).clear();
			Thread.sleep(1000);
			
			driver.findElements(By.cssSelector
		            ("body > div:nth-child(16) > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(5)")).get(0).click();
			Thread.sleep(2000);
			
//			driver.findElement(By.xpath("//*[@id=\"departure\"]")).sendKeys("2019-10-12");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"departure\"]")).sendKeys(Keys.RETURN);
			
			
			
			
			
			driver.close();
			
			

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
