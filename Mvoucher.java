package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mvoucher {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8087/compas/#/login";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMvoucher() throws Exception {
    driver.get(baseUrl + "/compas/#/login");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("KADMIN");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.linkText("Masters")).click();
    driver.findElement(By.linkText("Voucher")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("inpVoucherCode")).click();
    driver.findElement(By.id("inpVoucherDesc")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[13]")).clear();
    driver.findElement(By.xpath("(//button[@type='button'])[13]")).sendKeys("01-July-2017");
    driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[99]")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("inpAgentCode")).clear();
    driver.findElement(By.id("inpAgentCode")).sendKeys("8500");
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).clear();
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).sendKeys("");
    driver.findElement(By.xpath("(//button[@type='button'])[103]")).click();
    // ERROR: Caught exception [unknown command []]
    driver.findElement(By.id("inpVoucherCode")).clear();
    driver.findElement(By.id("inpVoucherCode")).sendKeys("ch4");
    driver.findElement(By.id("inpVoucherDesc")).clear();
    driver.findElement(By.id("inpVoucherDesc")).sendKeys("alex vv");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("01-July-2017");
    // ERROR: Caught exception [unknown command []]
    driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("20-July-2017");
    // ERROR: Caught exception [unknown command []]
    // ERROR: Caught exception [unknown command []]
    driver.findElement(By.id("inpAgentCode")).clear();
    driver.findElement(By.id("inpAgentCode")).sendKeys("9500");
    // ERROR: Caught exception [unknown command []]
    // ERROR: Caught exception [unknown command []]
    // ERROR: Caught exception [unknown command []]
    // ERROR: Caught exception [unknown command []]
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
