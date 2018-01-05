package com.compulynx_compas.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.rules.ErrorCollector;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	@Rule
	public ErrorCollector collector = new ErrorCollector();
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseUrl = "http://localhost:8087/compas/#/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void rightCredentials() {
		driver.get(baseUrl + "login");
		driver.findElement(By.name("userName")).sendKeys("kadmin");
		WebElement usernameElement = driver.findElement(By.name("userName"));
		String usernameString = usernameElement.getAttribute("value");
		collector.checkThat(usernameString, equalTo("kadmin"));
		driver.findElement(By.name("password")).sendKeys("1234");
		WebElement pword = driver.findElement(By.name("password"));
		String pwordString = pword.getAttribute("value");
		collector.checkThat(pwordString, equalTo("1234"));
		driver.findElement(By.xpath("//button[@type='button']")).click();
		/*WebElement element = driver.findElement(By.xpath("//button[@type='button']"));
		String loginButton = element.getText();
		driver.findElement(By.linkText("Administrator")).click();
		WebElement admin = driver.findElement(By.linkText("Administrator"));
		String adminLink = admin.getText();
		WebElement logout = driver.findElement(By.linkText("Log Out"));
		String logoutString = logout.getText();
		driver.findElement(By.linkText("Log Out")).click();*/
		System.out.println("LogginUser: " + usernameString);
		System.out.println("Password: " + pword);
		 assertTrue(driver.getCurrentUrl().endsWith("dashboard"));
	}

	@Test
	public void logout() {
		driver.get(baseUrl + "login");
		driver.findElement(By.name("userName")).sendKeys("wrong");
		WebElement usernameElement = driver.findElement(By.name("userName"));
		String usernameString = usernameElement.getAttribute("value");
		driver.findElement(By.name("password")).sendKeys("wrong");
		WebElement pword = driver.findElement(By.name("password"));
		String pwordString = pword.getAttribute("value");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println("LogginUser: " + usernameString);
		System.out.println("Password: " + pword);	
		 assertTrue(driver.getCurrentUrl().endsWith("login"));
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
