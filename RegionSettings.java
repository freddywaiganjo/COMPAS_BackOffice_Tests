package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegionSettings {
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
  public void testRegionSettings() throws Exception {
    driver.get(baseUrl + "/compas/#/login");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("kadmin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[3]/a/span")).click();
    driver.findElement(By.cssSelector("li.ng-scope.open > ul.ng-scope > li.ng-scope > a > span.ng-binding")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("inpZoneName")).clear();
    driver.findElement(By.id("inpZoneName")).sendKeys("alex123");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    driver.findElement(By.id("inpZoneCode")).clear();
    driver.findElement(By.id("inpZoneCode")).sendKeys("rg29");
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    driver.findElement(By.id("inpZoneName")).clear();
    driver.findElement(By.id("inpZoneName")).sendKeys("compas region");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[3]/ul/li[2]/a/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("inpAreaName")).clear();
    driver.findElement(By.id("inpAreaName")).sendKeys("compas zone");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[3]/ul/li[3]/a/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("locationName")).clear();
    driver.findElement(By.id("locationName")).sendKeys("Marsabit edited");
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
    driver.findElement(By.cssSelector("span.hidden-xs > span")).click();
    driver.findElement(By.linkText("Log Out")).click();
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
