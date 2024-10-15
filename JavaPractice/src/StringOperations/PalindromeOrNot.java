package StringOperations;

import java.util.Scanner;

public class PalindromeOrNot {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Palindrome Number:");
		  int number=sc.nextInt();
		if(isPalindrome(number)) {
			      System.out.println("Given number  "+number+" is palindrome");
		}else {
			 System.out.println("Given number  "+number+" is not palindrome");
		}
		    sc.close();            
	}

	
	
	
	public static boolean isPalindrome(int number) {
		                int originalNum=number,reverseNumber=0,remainder;
		              
		              while(number!=0) {
		            	        remainder=number%10;
		            	        reverseNumber= reverseNumber*10+remainder;
		            	        number /= 10;
		              }
					return originalNum==reverseNumber;
		                   
						
	}
}
