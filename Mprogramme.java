package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mprogramme {
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
  public void testMprogramme() throws Exception {
    driver.get(baseUrl + "/compas/#/login");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("kadmin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.linkText("Masters")).click();
    driver.findElement(By.linkText("Programme")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.xpath("//input[@id='']")).clear();
    driver.findElement(By.xpath("//input[@id='']")).sendKeys("MARSABIT COUNTY CTP");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[5]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div/dl/div[2]/label[5]/span")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[6]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div[2]/dl/div[2]/label/span")).click();
    driver.findElement(By.cssSelector("th > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
    driver.findElement(By.xpath("(//div[@id='s2id_voucher.frqSelect']/a)[3]")).click();
    driver.findElement(By.linkText("Identification Transaction Module")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div/div[2]/div/div[2]/div/label/span")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div/div[2]/div/div[3]/div/label/span")).click();
    driver.findElement(By.linkText("Channel Transaction Module")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div[2]/div[2]/div/div[2]/div/label/span")).click();
    driver.findElement(By.linkText("Interface Transaction Module")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div[3]/div[2]/div/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[105]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("noOfEmployees")).clear();
    driver.findElement(By.id("noOfEmployees")).sendKeys("cde3");
    driver.findElement(By.xpath("//input[@id='']")).clear();
    driver.findElement(By.xpath("//input[@id='']")).sendKeys("prgme new");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div/dl/div[2]/label[2]/span")).click();
    driver.findElement(By.cssSelector("th > input.ng-valid.ng-dirty")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div/div[2]/div/div[2]/div/label/span")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div[2]/div[2]/div/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div[3]/div[2]/div/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[105]")).click();
    driver.findElement(By.cssSelector("span.hidden-xs")).click();
    driver.findElement(By.xpath("//section[@id='header']/header/div[3]/ul/li/ul/li[2]/a/span")).click();
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
