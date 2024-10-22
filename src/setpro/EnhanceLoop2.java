package setpro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Create a HashSet and iterate each value in the set by using enhanced for loop
//Input : List = 10,20,30,40,50,60,70,80,90,10,20
public class EnhanceLoop2 {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(10);
		l.add(20);
		System.out.println(l);
		System.out.println(l.size());
		Set<Integer> s=new HashSet<Integer>();
		boolean addAll = s.addAll(l);
System.out.println(addAll);
System.out.println(s.size());
for (Integer integer : s) {
	System.out.println(integer);
	
}
	}

}
