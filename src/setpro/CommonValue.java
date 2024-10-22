package setpro;
//Create a new LinkedHashSet with values and return the common values
//Input : List = 10,20,30,90,10,10,40,50
//Input : List = 10,20,60,50,40,70,80,90

import java.util.ArrayList;
import java.util.List;

public class CommonValue {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println(l);
		System.out.println(l.size());
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(40);
		l2.add(50);
		l2.add(60);
		l2.add(70);
		l2.add(80);
		l2.add(90);
		System.out.println(l2);
		System.out.println(l2.size());
		l2.retainAll(l);
		System.out.println(l2);
		
	}

}
