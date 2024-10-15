package com.tutorialninja.tests;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests {
	@BeforeSuite
	public void m1() {
		System.out.println("Login - Before Suite");
	}
	
	@BeforeTest
	public void m2() {
		System.out.println("Login - Before Test");
	}
	@BeforeClass
	public void m3() {
		System.out.println("Login - Before class");
	}
	
	@BeforeMethod
	public void m4() {
		 System.out.println("Login - Before Method ");
	}
	
	
    @Test
    public void testValidLogin() {
        System.out.println("Running: testValidLogin");
        // Simulate a successful login
        String expectedMessage = "Login Successful";
        String actualMessage = "Login Successful"; // Assume this comes from the application
        Assert.assertEquals(actualMessage, expectedMessage, "Valid login test failed!");
    }

    @Test
    public void testInvalidLogin() {
        System.out.println("Running: testInvalidLogin");
        // Simulate a failed login attempt
        String expectedMessage = "Invalid credentials";
        String actualMessage = "Invalid credentials"; // Assume this comes from the application
        Assert.assertEquals(actualMessage, expectedMessage, "Invalid login test failed!");
    }
        
        @AfterMethod
    	public void m5() {
    		System.out.println("Login - After Method");
    	}

      
    
    @AfterClass
    	public void m6() {
    		System.out.println("Login - After class");
    	}
    
  
    @AfterTest
	public void m7() {
		System.out.println("Login - After Test");
	}

    
    @AfterSuite
	public void m8() {
		System.out.println("Login - After Suite");
	}
    
}

