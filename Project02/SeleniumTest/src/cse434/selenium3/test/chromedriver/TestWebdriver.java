package cse434.selenium3.test.chromedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"s2id_origin\"]/a/span[1]")).click();
			driver.findElement(By.xpath("/html/body/div[18]/div/input")).sendKeys("jfk");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[18]/div/input")).sendKeys(Keys.RETURN);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"s2id_destination\"]/a/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("washington");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.RETURN);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"departure\"]")).click();
			//driver.findElement(By.xpath("//*[@id=\"departure\"]")).clear();
			Thread.sleep(1000);
			
			driver.findElements(By.cssSelector
		            ("body > div:nth-child(21) > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(7)")).get(0).click();
			
			//driver.findElement(By.xpath("//*[@id=\"departure\"]")).sendKeys("2019-10-12");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"departure\"]")).sendKeys(Keys.RETURN);
			
			//*[@id="departure"]
			
			
			
			driver.close();
			
			

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
