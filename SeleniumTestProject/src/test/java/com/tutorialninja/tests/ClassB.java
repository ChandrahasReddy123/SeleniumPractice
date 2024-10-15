package com.tutorialninja.tests;

import org.testng.annotations.Test;

public class ClassB {
	
	 @Test(priority = 0)
	   public void methodBOne() {
		   System.out.println("methodBOne test method");
	   }
		@Test(priority = 1)
		public void methodBTwo() {
			   System.out.println("methodBTwo test method");
		   }
		@Test(priority = 2)
		public void methodBThree() {
			   System.out.println("methodBThree test method");
		   }
		@Test(priority = 3)
	   public void methodBFour() {
		   System.out.println("methodBFour test method");
	   }
		@Test(priority = 4)
		public void methodBFive() {
			System.out.println("methodBFive test Method");
		}

}
