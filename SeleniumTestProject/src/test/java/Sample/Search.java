package Sample;

import org.testng.annotations.Test;

public class Search {
	@Test(priority = 1,groups = {"smoke","sanity","regression","Login","all"})
	public void verifySearchWithExistingProduct() {
	  System.out.println("verifySearchWithExistingProduct-Search");
	}
	 @Test(priority = 2,groups = {"smoke","sanity","regression","Login","all"})
 public void verifySearchWithNonExistingProduct() {
	   System.out.println("verifySearchWithNonExistingProduct-Search");
 }
	 @Test(priority = 3,groups = {"sanity","regression","Login","all"})
	 public void verifySearchWithOutProductName() {
		        System.out.println("verifySearchWithOutProductName-Search");
	 }
	 @Test(priority = 4,groups = {"sanity","regression","Login","all"})
	 public void verifySearchProductByCategory() {
		    System.out.println("verifyRegisterWithDuplicateEmail-Search");
	 }
	 @Test(priority = 5,groups = {"sanity","regression","Login","all"})
	 public void verifySearchProductSubCategories() {
		 System.out.println("verifySearchProductSubCategories-Search");
	 }
	 @Test(priority = 6,groups = {"sanity","regression","Login","all"})
	 public void verifySearchInputTextFiledPlacholderText() {
		                  System.out.println("verifySearchInputTextFiledPlacholderText-Search");
	 }
	 @Test(priority = 7,groups = {"sanity","regression","Login","all"})
	 public void verifyNaviagatingSearchPageUsingSiteMap() {
		 System.out.println("verifyNaviagatingSearchPageUsingSiteMap-Search");
		 
	 }
}
