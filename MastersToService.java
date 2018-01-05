package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MastersToService {
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
  public void testMastersToService() throws Exception {
    driver.get(baseUrl + "/compas/#/login");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("kadmin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.linkText("Masters")).click();
    driver.findElement(By.cssSelector("li.ng-scope.open > ul.ng-scope > li.ng-scope > a > span.ng-binding")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.xpath("(//input[@id='inpMerchantName'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpMerchantName'])[2]")).sendKeys("KRCS");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("inpMerchantName")).clear();
    driver.findElement(By.id("inpMerchantName")).sendKeys("KM34");
    driver.findElement(By.xpath("(//input[@id='inpMerchantName'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpMerchantName'])[2]")).sendKeys("MCM_ALEX");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.linkText("Branch")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.id("branchName")).clear();
    driver.findElement(By.id("branchName")).sendKeys("COMMON MKT");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("branchCode")).clear();
    driver.findElement(By.id("branchCode")).sendKeys("MCD3");
    driver.findElement(By.id("branchName")).clear();
    driver.findElement(By.id("branchName")).sendKeys("MKT_ALEX");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[4]/ul/li[3]/a/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("inpAgentDesc")).clear();
    driver.findElement(By.id("inpAgentDesc")).sendKeys("Hassan Hussein-EDIT");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("inpAgentCode")).clear();
    driver.findElement(By.id("inpAgentCode")).sendKeys("ACD4");
    driver.findElement(By.id("inpAgentDesc")).clear();
    driver.findElement(By.id("inpAgentDesc")).sendKeys("AGTNAME");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
    driver.findElement(By.linkText("Product")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("inpProductName")).clear();
    driver.findElement(By.id("inpProductName")).sendKeys("Cash_1");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("inpProductCode")).clear();
    driver.findElement(By.id("inpProductCode")).sendKeys("PCD2");
    driver.findElement(By.id("inpProductName")).clear();
    driver.findElement(By.id("inpProductName")).sendKeys("PDT_ALEX");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[4]/ul/li[5]/a/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("inpBnfgrpDesc")).clear();
    driver.findElement(By.id("inpBnfgrpDesc")).sendKeys("Village 2");
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[2]")).sendKeys("3");
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[2]")).sendKeys("4");
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[2]")).sendKeys("5");
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpCode'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpCode'])[2]")).sendKeys("3");
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[3]")).sendKeys("10");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("inpBnfgrpCode")).clear();
    driver.findElement(By.id("inpBnfgrpCode")).sendKeys("BGC4");
    driver.findElement(By.id("inpBnfgrpDesc")).clear();
    driver.findElement(By.id("inpBnfgrpDesc")).sendKeys("BGN_ALEX");
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[2]")).sendKeys("5");
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpCode'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpCode'])[2]")).sendKeys("5");
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpBnfgrpDesc'])[3]")).sendKeys("10");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[4]/ul/li[6]/a/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
    driver.findElement(By.xpath("(//input[@id='inpMerchantName'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpMerchantName'])[2]")).sendKeys("Meals-1");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("inpMerchantName")).clear();
    driver.findElement(By.id("inpMerchantName")).sendKeys("CGC4");
    driver.findElement(By.xpath("(//input[@id='inpMerchantName'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='inpMerchantName'])[2]")).sendKeys("CGY_ALEX");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[4]/ul/li[7]/a/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("itemName")).clear();
    driver.findElement(By.id("itemName")).sendKeys("CASH_1");
    driver.findElement(By.xpath("(//input[@id='itemName'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='itemName'])[2]")).sendKeys("CASH MONEY");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("fileInput")).clear();
    driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\user\\Desktop\\alexander.jpg");
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("itemCode")).clear();
    driver.findElement(By.id("itemCode")).sendKeys("CCD3");
    driver.findElement(By.id("itemName")).clear();
    driver.findElement(By.id("itemName")).sendKeys("CASH-2");
    driver.findElement(By.xpath("(//input[@id='itemName'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='itemName'])[2]")).sendKeys("MONY MONY");
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("fileInput")).clear();
    driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\user\\Desktop\\web-site.png");
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[4]/ul/li[8]/a/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("inpVoucherCode")).clear();
    driver.findElement(By.id("inpVoucherCode")).sendKeys("VC02");
    driver.findElement(By.id("inpVoucherDesc")).clear();
    driver.findElement(By.id("inpVoucherDesc")).sendKeys("CASH VOUCHER_1");
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[90]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
    driver.findElement(By.id("select2-chosen-75")).click();
    driver.findElement(By.cssSelector("b")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.id("inpAgentCode")).clear();
    driver.findElement(By.id("inpAgentCode")).sendKeys("4000");
    driver.findElement(By.cssSelector("td > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.cssSelector("td > input.ng-valid.ng-dirty")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[94]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("inpVoucherCode")).clear();
    driver.findElement(By.id("inpVoucherCode")).sendKeys("VCD4");
    driver.findElement(By.id("inpVoucherDesc")).clear();
    driver.findElement(By.id("inpVoucherDesc")).sendKeys("CASHHERE");
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[47]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[47]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[65]")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.cssSelector("td > input.ng-pristine.ng-valid")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[87]")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[4]/ul/li[9]/a/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.xpath("//input[@id='']")).clear();
    driver.findElement(By.xpath("//input[@id='']")).sendKeys("MARSABIT COUNTY CTP edit");
    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[49]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[61]")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[3]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div/dl/div[2]/label[3]/span")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[4]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div/dl/div[2]/label[4]/span")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[5]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div/dl/div[2]/label[5]/span")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[2]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div/dl/div[2]/label[2]/span")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
    driver.findElement(By.id("checkbox1")).click();
    driver.findElement(By.cssSelector("label.ui-checkbox > span")).click();
    driver.findElement(By.linkText("Channel Transaction Module")).click();
    driver.findElement(By.xpath("(//input[@name='checkbox1'])[5]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div[2]/div[2]/div/div[2]/div/label/span")).click();
    driver.findElement(By.linkText("Interface Transaction Module")).click();
    driver.findElement(By.xpath("(//input[@name='checkbox1'])[8]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div[3]/div[2]/div/div/div/label/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[89]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("noOfEmployees")).clear();
    driver.findElement(By.id("noOfEmployees")).sendKeys("cpe56");
    driver.findElement(By.xpath("//input[@id='']")).clear();
    driver.findElement(By.xpath("//input[@id='']")).sendKeys("moneyprogram");
    driver.findElement(By.xpath("(//button[@type='button'])[22]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[49]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[49]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[61]")).click();
    driver.findElement(By.id("active")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[5]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div/dl/div[2]/label[5]/span")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[6]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div[2]/dl/div[2]/label/span")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[7]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div[2]/dl/div[2]/label[2]/span")).click();
    driver.findElement(By.xpath("(//input[@name='radio1'])[6]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[2]/div[4]/div[2]/dl/div[2]/label/span")).click();
    driver.findElement(By.name("checkbox1")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div/div[2]/div/div[2]/div/label/span")).click();
    driver.findElement(By.xpath("(//input[@name='checkbox1'])[6]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div[2]/div[2]/div/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("(//input[@name='checkbox1'])[10]")).click();
    driver.findElement(By.xpath("//section[@id='content']/div/form[2]/section/div[4]/accordion/div/div[3]/div[2]/div/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[96]")).click();
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
