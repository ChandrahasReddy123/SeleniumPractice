package com.tutorialninja.tests;

import java.util.Iterator;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(priority = 0)
   public void sampleOne() {
	   System.out.println("sampleOne test method");
   }
	@Test(priority = 1)
	public void sampleTwo() {
		System.out.println("sampleTwo Test Method");
	}
	@Test(priority = 2)
	public void sampleThree() {
		System.out.println("sampleThree Test Method");
	}
	@Test(priority = 3)
   public void sampleFour() {
	   System.out.println("sampleFour test method");
   }
	@Test(priority = 4)
	public void sampleFive() {
		System.out.println("sampleFive test Method");
	}

}
