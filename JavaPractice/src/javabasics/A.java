package javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A {
	
					public static int  m1(String n) {
						      int a=Integer.parseInt(n);
						      return a;
					}
	                     public static HashMap<String, Integer>  m2(){
	                    	 HashMap<String, Integer> hashMap = new HashMap<>();
	                    	 hashMap.put("Alice", 30);
	                         hashMap.put("Bob", 25);
	                         hashMap.put("Charlie", 35);
	                         Integer age = hashMap.get("Alice");
	                         System.out.println("Alice's age: " + age);
	                         if (hashMap.containsKey("Bob")) {
	                             System.out.println("Bob's age: " + hashMap.get("Bob")); // Output: Bob's age: 25
	                         } else {
	                             System.out.println("Bob is not in the map.");
	                         }

	                    	 return hashMap;
	                    	 
	                     }
           public static void main(String[] args) {
        	   System.out.println(Integer.MAX_VALUE+"   "+Integer.MIN_VALUE);
        	   System.out.println(Character.MAX_VALUE+"     "+Integer.MIN_VALUE);
        	   System.out.println(Float.MAX_VALUE+"  "+Integer.MIN_VALUE);
        	   System.out.println(Double.MAX_VALUE+" "+Integer.MIN_VALUE);
        	   System.out.println(Short.MAX_VALUE+"  "+Integer.MIN_VALUE);
        	   System.out.println(Long.MAX_VALUE+"   "+Integer.MIN_VALUE);
        	   System.out.println(Character.MIN_VALUE+"    "+Character.MAX_VALUE);
        	   Long l=Long.valueOf(10);
        	   System.out.println(l);
        	  
        	   System.out.println(m1("102"));
        	   ArrayList<Integer> al=new ArrayList<Integer>();
        	   HashMap<String, Integer> hs1=m2();
        	   System.out.println("All entries in the map:");
               for (Map.Entry<String, Integer> entry : hs1.entrySet()) {
                   System.out.println(entry.getKey() + ": " + entry.getValue());
               }
               System.out.println(2+5);
           }
}
