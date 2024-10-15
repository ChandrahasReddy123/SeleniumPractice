package Sample;

import org.testng.annotations.Test;
@Test(groups= {"all"})
public class Register {
	@Test(priority = 2,groups = {"smoke","regression","Register","all"})
	public void VerifyRegisterWithMandatoryFields() {
		  System.out.println("VerifyRegisterWithMandatoryFields-Register");
	}
	 @Test(priority = 1,groups= {"smoke","sanity","regression","Register","all"})
   public void verifyRegisterWithAllFields() {
	   System.out.println(" verifyRegisterWithAllFields-Register");
   }
	 @Test(priority = 3,groups = {"sanity","regression","Register","all"})
	 public void verifyRegisterWithOutAllFields() {
		        System.out.println("verifyRegisterWithOutAllFields-Register");
	 }
	 @Test(priority = 4,groups = {"sanity","regression","Register","all"})
	 public void verifyRegisterWithDuplicateEmail() {
		    System.out.println("verifyRegisterWithDuplicateEmail-Register");
	 }
	 @Test(priority = 5,groups = {"regression","Register","all"})
	 public void verifyRegisterInvalidEmail() {
		 System.out.println("verifyRegisterInvalidEmail-Register");
	 }
	 @Test(priority = 6,groups = {"sanity","regression","Registers","all"})
	 public void verifyRegisterInvalidPhoneNumber() {
		                  System.out.println("verifyRegisterInvalidPhoneNumber-Register");
	 }
	 @Test(priority = 7,groups = {"regression","Register","all"})
	 public void verifyAllRegisterFieldsHavePlaceHolders() {
		 System.out.println(" verifyAllRegisterFieldsHavePlaceHolders-Register");
		 
	 }
}
