
package com.tutorialninja.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GlobalQARegister {
	
                   WebDriver driver;
                   @Parameters({"url"})
                   @BeforeTest
	public void Setup(String url) {
		                         driver=new ChromeDriver();
		                         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		                         driver.manage().window().maximize();
		                         driver.get(url);
		                         
	}
                    @AfterTest
                      public void teardown() {
                    	      // driver.quit();
                      }
                      
                     @Parameters({"expectedTitle"})
                      @Test(priority = 1)
                  public void verifyTitle(String expectedTitle) {
                	      String actualTitle=driver.getTitle();
                	      assertEquals(actualTitle,  expectedTitle,"Application title does not match the expected title");
                	      
                  }
                      @Test(priority = 2)
                  public void verifyLogo() {
                	       boolean logoIsDisplayed=driver.findElement(By.xpath("//img[@alt='GlobalSQA']")).isDisplayed();
                	       assertTrue(logoIsDisplayed,"logo is Displayed successfully");
                  }
                      @Test(priority = 3)
                  public void globalQARegistration() throws InterruptedException {
                	 WebElement TesterHub= driver.findElement(By.xpath("//a[text()='Tester’s Hub']"));
                	 WebElement DemoTestingWebSite=driver.findElement(By.xpath("//span[text()='Demo Testing Site']"));
                	  Actions act=new Actions(driver);
                	  act.moveToElement(TesterHub).moveToElement(DemoTestingWebSite).click().build().perform();
                	  Thread.sleep(3000);
                	  driver.findElement(By.xpath("//a[text()='SamplePage']")).click();
                	  String samplePage= driver.findElement(By.xpath("//div[@class='page_heading']/h1")).getText();
                	   assertEquals("Sample Page Test",samplePage,"sample page is displayed");
                	   String folderPath="C:\\Users\\ChandrahasReddy\\Pictures\\Camera Roll";
                	   driver.findElement(By.xpath("//input[@type='file']")).sendKeys(folderPath);
                	   driver.findElement(By.xpath("//input[@type='file']")).click();
                  }
}
