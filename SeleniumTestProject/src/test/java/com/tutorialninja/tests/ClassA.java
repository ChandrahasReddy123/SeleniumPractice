package com.tutorialninja.tests;

import org.testng.annotations.Test;

public class ClassA {
	
	 @Test(priority = 0)
	   public void methodAOne() {
		   System.out.println("methodAOne test method");
	   }
		@Test(priority = 1)
		public void methodATwo() {
			   System.out.println("methodATwo test method");
		   }
		@Test(priority = 2)
		public void methodAThree() {
			   System.out.println("methodAThree test method");
		   }
		@Test(priority = 3)
	   public void methodAFour() {
		   System.out.println("methodAFour test method");
	   }
		@Test(priority = 4)
		public void methodAFive() {
			System.out.println("methodAFive test Method");
		}

}
