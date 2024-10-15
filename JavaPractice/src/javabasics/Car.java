package javabasics;

public class Car {
   String name;
   int cost;
          void modifyCar(Car y) {
        	               y.name="BMW";
        	               y.cost=200000;
          }
          
          public void m1() {
        	  int sum,i;
        	  for(i=1, sum=0; i<=5 ; sum += i ,i++) {
        		   System.out.println(i);
        	
        	  }
        	  System.out.println(sum);
          }
   public static void main(String[] args) {
	                          Car x=new Car();
	                          x.name="maruthi";
	                         x.cost=300000;
	                          System.out.println(x.name);
	                          System.out.println(x.cost);
	                             x.modifyCar(x);
	                             System.out.println(x.name);
	                             System.out.println(x.cost);
	                             x.m1();
	                          
}
     
}
