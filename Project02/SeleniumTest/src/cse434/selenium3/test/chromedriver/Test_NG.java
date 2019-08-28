package cse434.selenium3.test.chromedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
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
	
	@BeforeMethod
	public void beforeMethod() {
		
		//throw new SkipException("");
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		//throw new SkipException("");
		
	}
	
	
	@Test(priority=1)
	public void blankField() {
		
		blankSignupForm();
	}
	
	
	@Test(priority=2)
	public void invalidField() {
		
		invalidInput();
	}
	
	
	@Test(priority=3)
	public void passwordCheck() {
		
		//throw new SkipException("Skip this test method");
		
		System.out.println("Skip this test");
	}
	
	@Test(priority=4)
	public void signUp() {
		
		
		signup();
		
	}
	
	@Test(priority=5 , dependsOnMethods = {"signUp"})
	public void signupLogout() {	
		logout();
	}

	@Test(priority=6)
	public void failedlogin() {	
		invalidLogin();
		
		Assert.assertEquals("use@phptravels.com", "use@phptravels.com");
	}
	
	
	@Test(priority=7)
	public void logIn() {
		
		login();
		
		Assert.assertEquals("user@phptravels.com", "user@phptravels.com");
		
	}
	
	
	@Test(priority=8, dependsOnMethods = {"logIn"})
	public void signinLogout() {	
		logout();
	}
	
	
	@Test(priority=9)
	public void bookingForTour() {
		
		tourBooking();

	}
	
	@Test(priority=10)
	public void traveoffer() {
		
		offer();
		
	}
	
	@Test(priority=11)
	public void travelBlog() {
		
		blog();
		
	}
	
	
	
	
	
	
	
	public void blankSignupForm() {
		
		try {
			driver.get("https://www.phptravels.net/register");
			Thread.sleep(1000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,200)");
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();
			jse.executeScript("scroll(0,-200)");
			Thread.sleep(2000);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void invalidInput() {
		
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/input")).sendKeys("Md Monir");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/input")).sendKeys("Hossan12");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/input")).sendKeys("7823");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input")).sendKeys("monir@gm");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/input")).sendKeys("12456");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/input")).sendKeys("1236");
			Thread.sleep(1000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,500)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();
			jse.executeScript("scroll(0,-200)");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	public void signup() {
		
		
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
			Thread.sleep(2000);
			

			
//			Select select = new Select(driver.findElement(By.cssSelector("body > nav > div > div.collapse.navbar-collapse > ul.nav.navbar-nav.navbar-right.hidden-sm.go-left > ul > li:nth-child(1) > a")));
//			Thread.sleep(1000);
//			select.selectByIndex(1);
//			Thread.sleep(1000);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void logout() {
		
		try {
			Thread.sleep(1000);
			driver.get("https://www.phptravels.net/account/logout");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public  void invalidLogin() {
		
		try {
			driver.get("https://www.phptravels.net/login");
			
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys("monirmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("123456");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/label")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
			Thread.sleep(2000);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void login() {
		
		try {
			driver.get("https://www.phptravels.net/login");
			
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys("user@phptravels.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("demouser");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/label")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
			Thread.sleep(2000);
			driver.get("https://www.phptravels.net/account/logout");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void tourBooking() {
		try {
			
			driver.get("https://www.phptravels.net");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[3]/a")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Dubai");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[18]/div/input")).sendKeys(Keys.RETURN);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tchkin\"]/div/input")).click();
			Thread.sleep(1000);
			
			driver.findElements(By.cssSelector
		            ("body > div:nth-child(16) > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(5)")).get(0).click();
			Thread.sleep(2000);

//			driver.findElement(By.xpath("//*[@id=\"adults\"]/option[4]")).sendKeys(Keys.RETURN);
			
			Select select = new Select(driver.findElement(By.id("adults")));
			Thread.sleep(1000);
			select.selectByIndex(2);
			Thread.sleep(1000);
			
			Select select2 = new Select(driver.findElement(By.id("tourtype")));
			Thread.sleep(1000);
			select2.selectByIndex(1);
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//*[@id=\"tours\"]/form/div[5]/button")).click();
			Thread.sleep(2000);
			
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,1200)");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/div/form/div/div[2]/input")).click();
			Thread.sleep(1000);
		
			driver.findElements(By.cssSelector
		            ("body > div.datepicker.dropdown-menu > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(4)")).get(0).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/div/form/div/div[2]/button")).click();
			Thread.sleep(3000);

			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,1200)");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/form/div[4]/button")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/input")).sendKeys("Md Monir");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[3]/input")).sendKeys("Hossan");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[2]/input")).sendKeys("mdmonir@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[3]/input")).sendKeys("mdmonir@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[3]/div[2]/input")).sendKeys("01782345054");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[4]/div[2]/input")).sendKeys("Dhaka, Bangladesh");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a")).sendKeys("Bangladesh");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,200)");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[8]/div/div[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"special\"]/div/textarea")).sendKeys("I need some extra facility like field ");			
			Thread.sleep(2000);

			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,1200)");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div/div/div/div[1]/div[2]/div[4]/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div[2]/center/button[2]")).click();
			Thread.sleep(1000);
			
			Select select4 = new Select(driver.findElement(By.id("gateway")));
			Thread.sleep(1000);
			select4.selectByIndex(3);
			Thread.sleep(1000);
//			new WebDriverWait(driver, 20).until(
//			          webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
//			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void offer() {
		
		try {
			driver.get("https://www.phptravels.net");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/div[3]/div[2]/a[2]")).click();
			Thread.sleep(1000);

			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 500)");
			Thread.sleep(1000);
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void blog() {
		
		try {
			driver.get("https://www.phptravels.net");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[1]/a")).click();
			Thread.sleep(1000);

			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,800)");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[1]/ul/li[3]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[1]/div/div[2]/div[5]/a/h4")).click();
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
