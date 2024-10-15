package Sample;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority = 1,groups = {"smoke"})
	public void VerifyLoginWithValidCrendentials() {
		  System.out.println("VerifyLoginWithValidCrendentials-Login");
	}
	 @Test(priority = 2,groups = {"smoke","sanity","Regression","alltests","login"})
   public void verifyLoginWithInvalidCrendentials() {
	   System.out.println(" verifyLoginWithInvalidCrendentials");
   }
	 @Test(priority = 3,groups = {"sanity","Regression","alltests","login"})
	 public void verifyLoginWithValidEmailandInvalidPassword() {
		        System.out.println("verifyLoginWithValidEmailandInvalidPassword");
	 }
	 @Test(priority = 4,groups = {"sanity","Regression","alltests","login"})
	 public void verifyLoginWithInvalidEmailandValidPassword() {
		    System.out.println("verifyLoginWithInvalidEmailandValidPassword");
	 }
	 @Test(priority = 5,groups = {"sanity","Regression","alltests","login"})
	 public void verifyLoginWithoutCrendentials() {
		 System.out.println("verifyLoginWithoutCrendentials");
	 }
	 @Test(priority = 6,groups =  {"sanity","Regression","alltests","login"})
	 public void verifyLoginForgotLinkIsVisible() {
		                  System.out.println("verifyLoginForgotLinkIsVisible");
	 }
	 @Test(priority = 7,groups =  {"sanity","Regression","alltests","login"})
	 public void verifyForgotLinkNavigatation() {
		 System.out.println("verifyForgotLinkNavigatation");
		 
	 }
	 
	 
}
