package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	                  WebDriver driver;
	            @Test(invocationCount = 10,invocationTimeOut = 5000)
	public void randomNumberGenerator() {
		  driver = new ChromeDriver(); // Launch the browser
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://www.calculator.net/random-number-generator.html");
	        driver.findElement(By.xpath("//input[@class='inlonger' and @name='slower']")).sendKeys("1");
	        driver.findElement(By.xpath("//input[@class='inlonger' and @name='supper']")).sendKeys("500");
	        driver.findElement(By.xpath("(//input[@type='submit' and @name='x'])[1]")).click();
	       int RandomNumber= Integer.parseInt(driver.findElement(By.xpath("//p[@class='verybigtext']")).getText());
	       System.out.println(RandomNumber);
	       driver.quit();
	}
     
}
