package com.tutorialninja.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	  static WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver(); // Launch the browser
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home"); // Application URL is opened
	    }

	    @AfterMethod
	    public void teardown() {
	        driver.quit(); // Close the browser
	    }

	@Test
	public static void m1() {
		            String Expected_Title="Your AStore";
		            String Actual_Title=driver.getTitle();
		            SoftAssert softAssert=new SoftAssert();
		            softAssert.assertEquals(Expected_Title, Actual_Title);
		          driver.findElement(By.xpath("//a[@title='My Account']")).click();
		           driver.findElement(By.xpath("//a[text()='Login']")).click();
		          driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("gangireddy.chandrahas@gmail.com");
		          driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("Chandrahas@24");
		          driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		        
		         driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Hp",Keys.ENTER);
		         
		         softAssert.assertTrue(driver.findElement(By.xpath("//a[text()='HP LP3065']")).isDisplayed());
		         System.out.println("Hi Hello");
		             softAssert.assertAll();
		    
		            
		          
	}

}
