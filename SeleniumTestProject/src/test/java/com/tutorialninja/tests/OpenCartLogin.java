package com.tutorialninja.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class OpenCartLogin {
	
	 static WebDriver driver;
	 @BeforeSuite
	 public void m1() {
		       System.out.println("Before Suite");
	 }
	 @BeforeClass
	 public void m2() {
	       System.out.println("Before Class");
}
	
	   @BeforeMethod
	    @Parameters("url")
	  public void setUp(  String url) {
		   System.out.println("Before Method");
	        driver = new ChromeDriver(); // Launch the browser
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get(url); // Application URL is opened
	    }
	     @AfterMethod
	    public void teardown() {
	    	 System.out.println("AfterMethod");
	    	   driver.quit();
	    }
	        @Parameters({"email","password"})
	         @Test(priority = 1)
             public void verifyUserLoginWithValidCrendentials(String email,String password) {
	        	 System.out.println("Test method");
            	   driver.findElement(By.xpath("//a[@title='My Account']")).click();
		           driver.findElement(By.xpath("//a[text()='Login']")).click();
		          driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(email);
		          driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(password);
		          driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		          assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
             }
	        @Parameters({"email","password1"})
	         @Test(priority = 2)
	         public void verifyUserLoginWithValidUserNameAndInvalidPassword(String email,String password1) {
	        	 System.out.println("Test method");
	        	 driver.findElement(By.xpath("//a[@title='My Account']")).click();
		           driver.findElement(By.xpath("//a[text()='Login']")).click();
		          driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(email);
		          driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(password1);
		          driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		          assertEquals(driver.findElement(By.xpath("//div[contains(@class,'dismissible')]")).getText(),"Warning: No match for E-Mail Address and/or Password.");
	         }
	         @Test(priority = 3)
	         public void verifyUserLoginWithInvalidUserNameAndValidPassword() {
	        	 System.out.println("Test method");
	        	 driver.findElement(By.xpath("//a[@title='My Account']")).click();
		           driver.findElement(By.xpath("//a[text()='Login']")).click();
		          driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("gangireddy.chandrahas678@gmail.com");
		          driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("Chandrahas@24");
		          driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		          assertEquals(driver.findElement(By.xpath("//div[contains(@class,'dismissible')]")).getText(),"Warning: No match for E-Mail Address and/or Password.");
	         }
	         @Test(priority = 4)
	         public void verifyUserLoginWithInvalidUserNameAndInValidPassword() {
	        	 System.out.println("Test method");
	        	 driver.findElement(By.xpath("//a[@title='My Account']")).click();
		           driver.findElement(By.xpath("//a[text()='Login']")).click();
		          driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("gangireddy.chandrahas878@gmail.com");
		          driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("Chandrahas987@2412");
		          driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		          assertEquals(driver.findElement(By.xpath("//div[contains(@class,'dismissible')]")).getText(),"Warning: No match for E-Mail Address and/or Password.");
	         }
	         @Ignore
	         @Test(priority = 5)  
 	         public void verifyUserLoginWithOutGivingCrendentials() {
	        	 System.out.println("Test method");
	        	 driver.findElement(By.xpath("//a[@title='My Account']")).click();
		           driver.findElement(By.xpath("//a[text()='Login']")).click();
		          driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("");
		          driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("");
		          driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		          assertEquals(driver.findElement(By.xpath("//div[contains(@class,'dismissible')]")).getText(),"Warning: No match for E-Mail Address and/or Password.");
	         }
	         @AfterClass
	         public void afterClass() {
	             System.out.println("After Class");
	         }

	         @AfterTest
	         public void afterTest() {
	             System.out.println("After Test");
	         }
	         
	         @AfterSuite
	         public void afterSuite() {
	             System.out.println("After Suite");
	         }


	         
}
