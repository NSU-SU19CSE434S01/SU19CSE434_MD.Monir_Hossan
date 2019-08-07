package llogiccoveragewebaplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomateTest {

	 WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "/Users/MDMONIRHOSSAN/Documents/CSE434/Assignment04/AutomateTestWebFramework/chromedriver");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://cs.gmu.edu:8443/offutt/coverage/LogicCoverage?");
			
			putInput();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void putInput() {
		
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a & b");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a | b");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a & b");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a > b");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a = b");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a & b | c");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a | b & c ^ d");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a | b & c = d");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a = b");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a > b");
			clickTest();
			driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/font/input")).sendKeys("a | b & c ^ d = e > f");
			clickTest();
		
	}
	
	public void clickTest() {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[5]/td[2]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[8]/td[2]/input[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[8]/td[2]/input[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[8]/td[2]/input[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[8]/td[2]/input[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[8]/td[2]/input[3]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[11]/td[2]/input[1]")).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		AutomateTest test = new AutomateTest();
		test.invokeBrowser();
		
	}
	
	}
	
