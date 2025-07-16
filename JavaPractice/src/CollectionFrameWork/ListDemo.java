package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
  public static void main(String[] args) {
	     ArrayList a=new ArrayList();
	     a.add(40);
	     a.add(10);
	     a.add(20);
	     Object[] b=a.toArray();
	     System.out.println(b[0]);
}
}
