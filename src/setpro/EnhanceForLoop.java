package setpro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Get the each value of set by using enhanced  for loop
//Input:   List = 105,205,305,405,505,605,705,805
public class EnhanceForLoop {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);
		l.add(605);
		l.add(705);
		l.add(805);
		System.out.println(l);
		System.out.println(l.size());
		Set<Integer> s=new LinkedHashSet<Integer>();
		boolean addAll = s.addAll(l);
		System.out.println(addAll);
		for (Integer integer : s) {
			System.out.println(integer);
		}
		
	}

}
