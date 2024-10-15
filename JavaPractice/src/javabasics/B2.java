package javabasics;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Stack;

public class B2 extends A1 {
	   String str="chinna";
	   public void m1() {
		   System.out.println("B2 M1");
	   }
     public void m3() {
    	 System.out.println("B2 M3");
     }
     public static void main(String[] args) {
		      A1 a = new B2();
	     Class<?> b= a.getClass();
	        Method[] countmethods=b.getDeclaredMethods();
	        System.out.println(countmethods[0]);
	        System.out.println(countmethods[1]);
	        List l=new Stack<String>();
	        
		        
	}
}
