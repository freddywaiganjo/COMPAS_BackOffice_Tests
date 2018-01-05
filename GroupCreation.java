package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupCreation {
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
  public void testGroupCreation() throws Exception {
    driver.get(baseUrl + "/compas/#/login");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("kadmin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.cssSelector("span.ng-binding")).click();
    driver.findElement(By.cssSelector("li.ng-scope.open > ul.ng-scope > li.ng-scope > a > span.ng-binding")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("inpGroupCode")).clear();
    driver.findElement(By.id("inpGroupCode")).sendKeys("7j5");
    driver.findElement(By.id("inpGroupName")).clear();
    driver.findElement(By.id("inpGroupName")).sendKeys("alex99999");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.cssSelector("label > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.cssSelector("label > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.cssSelector("label > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[16]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[26]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[27]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[34]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[35]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[36]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[42]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[43]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[44]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[46]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[47]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[48]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[50]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[51]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[52]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[54]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[55]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[56]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[62]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[63]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[2]/div/section/div[2]/table/tbody/tr[16]/td[4]/label")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[64]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[66]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[67]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[68]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[70]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[71]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[72]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[90]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[91]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[92]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[94]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[95]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[96]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[106]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[107]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[108]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
    driver.findElement(By.cssSelector("span.hidden-xs > span")).click();
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
