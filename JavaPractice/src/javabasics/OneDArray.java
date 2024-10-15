package javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class OneDArray {
	static {
		System.out.println("Hi");
	}
	public OneDArray() {
		   System.out.println("Hello");
	}
	public static void main(String[] args) {
		    
		OneDArray b=new OneDArray();
	   
		int[] a = new int[]{10, 34, 56, 89, 95};
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(5);
		li.add(20);
		li.add(43);
		li.add(54);
		li.add(32);
Iterator<Integer>  element=li.iterator();

           while(element.hasNext()) {
        	   System.out.println(element.next());
           }
		
	}

}
