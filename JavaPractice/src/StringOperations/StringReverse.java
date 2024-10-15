package StringOperations;

public class StringReverse {
	public static void main(String[] args) {
		      String str="Geeks for Geeks",nstr="";
		         reverseString(str);
		         System.out.println();
		      System.out.println("Actual String:"+str);
		      System.out.println(str.length());
		      for(int i=0;i<str.length();i++) {
		    	             char a=str.charAt(i);
		    	             nstr=a+nstr;
		    	            
		    	          
		      }
		      System.out.println(nstr);
	}

	public static void reverseString(String str) {
		                      char[] b=str.toCharArray();
		                  for(int i=b.length-1;i>=0;i--) {
		                	  System.out.print(b[i]);
		                  }
	}
}
