package com.tutorialninja.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo {
    WebDriver driver = new ChromeDriver();

    @Test (priority = 0)
    public void CloseBrowser() {
        driver.close();
        Reporter.log("Driver Closed After Testing");
    }

    @Test (priority = -1)
    public void OpenBrowser() {
        Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
        Reporter.log("Launching Google Chrome Driver version 81 for this test");

        driver.get("https://www.toolsqa.com/testng/testng-asserts/");

        Reporter.log("The website used was DemoQA for this test", true);
        String expectedTitle = "How To Use TestNG Asserts with Selenium To Perform Validation?";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle);
    }
}