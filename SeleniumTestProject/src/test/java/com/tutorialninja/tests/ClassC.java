package com.tutorialninja.tests;

import org.testng.annotations.Test;

public class ClassC {
	 @Test(priority = 0)
	   public void methodCOne() {
		   System.out.println("methodCOne test method");
	   }
		@Test(priority = 1)
		public void methodCTwo() {
			   System.out.println("methodCTwo test method");
		   }
		@Test(priority = 2)
		public void methodCThree() {
			   System.out.println("methodCThree test method");
		   }
		@Test(priority = 3)
	   public void methodCFour() {
		   System.out.println("methodCFour test method");
	   }
		@Test(priority = 4)
		public void methodCFive() {
			System.out.println("methodCFive test Method");
		}
}
