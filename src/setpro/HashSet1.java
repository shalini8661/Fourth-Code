package setpro;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
// Create a HashSet for the below values
//Input : List = 10,20,30,40,50,60,70,80,90,10,20
public class HashSet1 {
public static void main(String[] args) {
	Set<String> s=new TreeSet<String>();
	s.add("Name");
	s.add("Id");
	s.add("Dob");
	s.add("Doj");
	s.add("Phno");
	s.add("Address");
	System.out.println(s);
	System.out.println(s.size());
}
}
