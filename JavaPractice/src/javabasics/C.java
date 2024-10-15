package javabasics;

public class C  extends B{
	public  void m2() {
		    d.m1();
		long epoch = System.currentTimeMillis();
		System.out.println(epoch);
	}
	public static void main(String[] args) {
		C c=new C();
		c.m1();
		c.m2();
	}

}
