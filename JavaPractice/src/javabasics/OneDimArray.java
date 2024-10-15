package javabasics;

public class OneDimArray {
	public static int linearSearch(int[] a,int target) {
		 for(int i=0;i<a.length;i++) {
    	     if(a[i]==target) {
    	    	 return i;
    	     }
		 }
		 return -1;
		 }
	public static void main(String[] args) {
		    int[] a=new int[]{10,34,56,89,95};
		    int[][][] k= {
		    		{{10,20,30}},
		    		{{20,40,50}},
		    		{{60,40,60}}
		    		};
		    System.out.println(k.length);
		    
		    int  target=89;
		      int result= linearSearch(a, target);
		     if(result!=-1) {
		    	 System.out.println("Element is found at index:"+result);
		     }else {
		    	 System.out.println("Element is not found");
		     }
		    }
	  
	
	}


