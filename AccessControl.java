package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessControl {
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
  public void testAccessControl() throws Exception {
    driver.get(baseUrl + "/compas/#/login");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("kadmin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.cssSelector("span.ng-binding")).click();
    driver.findElement(By.cssSelector("li.ng-scope.open > ul.ng-scope > li.ng-scope > a > span.ng-binding")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
    driver.findElement(By.id("inpGroupName")).clear();
    driver.findElement(By.id("inpGroupName")).sendKeys("VENDORS_1");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("inpGroupCode")).clear();
    driver.findElement(By.id("inpGroupCode")).sendKeys("al12");
    driver.findElement(By.id("inpGroupName")).clear();
    driver.findElement(By.id("inpGroupName")).sendKeys("alekieee");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.cssSelector("label > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.cssSelector("label > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.cssSelector("label > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[15]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[16]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[18]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[19]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[20]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[22]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[23]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[24]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[26]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[27]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[28]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[30]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[2]/div/section/div[2]/table/tbody/tr[8]/td[3]/label")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[31]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[32]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[34]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[35]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[36]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[38]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[39]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[40]")).click();
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
    driver.findElement(By.xpath("(//input[@type='checkbox'])[58]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[59]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[60]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[62]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[2]/div/section/div[2]/table/tbody/tr[16]/td[3]/label")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[63]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[64]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[66]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[67]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[68]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[70]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[71]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[72]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[74]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[75]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[76]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[78]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[79]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[80]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[82]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[83]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[84]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[86]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[87]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[88]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[90]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[91]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[92]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[94]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[95]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[96]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[98]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[99]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[100]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[102]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[103]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[104]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[106]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[107]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[108]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[110]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[111]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[112]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[114]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[115]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[116]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[118]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[119]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[120]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[122]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[123]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[124]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[126]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[127]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[128]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[130]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[131]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[132]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[135]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[134]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[136]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[137]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[138]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[139]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[140]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[141]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[142]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[143]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[144]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[145]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[146]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[147]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[148]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[149]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[150]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[151]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[152]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[153]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[154]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[155]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[156]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[157]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[158]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[159]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[160]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[161]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[162]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[163]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[164]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[165]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[166]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[167]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[168]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[169]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[170]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[171]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[172]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[173]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
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
