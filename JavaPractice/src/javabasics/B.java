package javabasics;

public class B  extends Thread{
	 public void run() {
		            this.evenNumbers();
		            this.oddNumber();
	 }
                   public void evenNumbers() {
                	   System.out.println(Thread.currentThread().getName());
                	   System.out.println("Even Numbers:");
                	   for(int i=0;i<=10;i++) {
                		   if(i%2==0) {
                			   System.out.println(i);
                		   }
                	   }
                   }
                   public void oddNumber() {
                	   System.out.println(Thread.currentThread().getName());
                	   System.out.println("Odd Numbers");
                	   for(int i=0;i<=10;i++) {
                		   if((i%2)!=0) {
                			   System.out.println(i);
                		   }
                	   }
                   }
             public static void main(String[] args) {
            	 System.out.println(Thread.currentThread().getName());
				       B b=new B();
				       Thread th=new Thread(b);
				       th.start();
				       
			}
                        
}
