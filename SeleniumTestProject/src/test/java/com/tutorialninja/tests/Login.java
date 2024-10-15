package com.tutorialninja.tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Login {
    static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(); // Launch the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/"); // Application URL is opened
    }

    @AfterMethod
    public void teardown() {
        driver.quit(); // Close the browser
    }
  
    @Test(priority = 0)
    public void verifyLoginWithValidCredentials() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Products']")).getText().contains("Products"));
        System.out.println("Hi Hello World");
    }

    @Test(priority = 1)
    public void verifyLoginWithInvalidCredentials() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user1");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Username and password do not match any user in this service']")).getText().contains("service"));
    }

    @Test(priority = 2)
    public void verifyLoginWithValidEmailAndInvalidPassword() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Username and password do not match any user in this service']")).getText().contains("service"));
    }

    @Test(priority = 3)
    public void verifyLoginWithInvalidEmailAndValidPassword() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user1");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Username and password do not match any user in this service']")).getText().contains("service"));
    }

    @Test(priority = 4)
    public void verifyLoginWithoutEmail() {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Username is required']")).getText().contains("required"));
    }

    @Test(priority = 5)
    public void verifyLoginWithoutPassword() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Password is required']")).getText().contains("required"));
    }
}
