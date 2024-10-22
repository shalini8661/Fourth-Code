package setpro;
//Create a new TreeSet with values and return the common values
//Input : List = 10,20,30,40,50,60,70,80
//Input : List = 100,200,300,400,500,600,700,8000

import java.util.Set;
import java.util.TreeSet;

public class SetTree {
	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		System.out.println(s);
		System.out.println(s.size());
		Set<Integer> s2=new TreeSet<Integer>();
		s2.add(100);
		s2.add(200);
		s2.add(300);
		s2.add(400);
		s2.add(500);
		s2.add(600);
		s2.add(700);
		s2.add(8000);
		System.out.println(s2);
		System.out.println(s2.size());
		s2.retainAll(s);
		System.out.println(s2);
		
		
	}

}
