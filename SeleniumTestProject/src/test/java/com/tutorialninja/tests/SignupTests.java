package com.tutorialninja.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignupTests {
	  static WebDriver driver;
	@BeforeSuite
	public void m1() {
		System.out.println("SignUp - Before Suite");
	}
	@Parameters("browserName")
	@BeforeTest
	public void IntializeBrowser(@Optional("chrome") String browserName) {
		switch (browserName) {
	    case "chrome":
	    {
	        driver = new ChromeDriver(); // Launch the Chrome browser
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/v1/"); // Application URL is opened
	        break; // Ensure to break after the Chrome case
	    }
	    case "fireFox":
	    {
	        driver = new FirefoxDriver(); // Launch the Firefox browser
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/v1/"); // Application URL is opened
	        break; // Ensure to break after the Firefox case
	    }
	    case "Edge":
	    {
	        driver = new EdgeDriver(); // Launch the Edge browser
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/v1/"); // Application URL is opened
	        break; // Ensure to break after the Edge case
	    }
	    default:
	    {
	        System.out.println("Invalid browser type"); // Handle invalid cases
	        break;
	    }
	}

	}
	@BeforeClass
	public void m3() {
		System.out.println("SignUp - Before class");
	}
	
	@BeforeMethod
	public void m4() {
		System.out.println("SignUp - Before Method");
	}
	

	@Parameters({"email","passWord"})
    @Test
    public void testValidSignup(String email,String passWord) {
        System.out.println("Running: testValidSignup");
        // Simulate a successful signup
        String expectedMessage = "Signup Successful";
        String actualMessage = "Signup Successful"; // Assume this comes from the application
        Assert.assertEquals(actualMessage, expectedMessage, "Valid signup test failed!");
        System.out.println(email+"     "+passWord);
    }

    @Test
    public void testInvalidSignup() {
        System.out.println("Running: testInvalidSignup");
        // Simulate a failed signup due to missing information
        String expectedMessage = "Please fill in all required fields";
        String actualMessage = "Please fill in all required fields"; // Assume this comes from the application
        Assert.assertEquals(actualMessage, expectedMessage, "Invalid signup test failed!");
    }
    @Parameters("sleeptime")
    @AfterMethod
	public void m5(long sleeptime) throws InterruptedException {
    	Thread.sleep(Long.valueOf(sleeptime));
		  driver.quit();
	}

  

@AfterClass
	public void m6() {
		System.out.println("SignUp - After class");
	}


@AfterTest
public void m7() {
	System.out.println("SignUp - After Test");
}


@AfterSuite
public void m8() {
	System.out.println("SignUp - After Suite");
}
}
