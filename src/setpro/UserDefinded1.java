package setpro;

import java.util.ArrayList;
import java.util.List;

public class UserDefinded1 {
public static void main(String[] args) {
	UserDefined u=new UserDefined();
	u.setId(100);
	u.setName("Arun");
	u.setPhono(8765439087l);
	u.setAddress("Thanjavur");
	u.setDob("8th july");
	u.setDoj("3rd june");
	u.setEmail("asfhgjvg@gmail");
	u.setGender("male");
	u.setSal(120000l);
	UserDefined u1=new UserDefined();
	u1.setId(200);
	u1.setName("lavanya");
	u1.setPhono(789039087l);
	u1.setAddress("Thanjavur");
	u1.setDob("18th febrary");
	u1.setDoj("31rd july");
	u1.setEmail("cvdgrfevg@gmail");
	u1.setGender("female");
	u1.setSal(145000l);
	UserDefined u2=new UserDefined();
	u2.setId(300);
	u2.setName("adam");
	u2.setPhono(8456239087l);
	u2.setAddress("Thanjavur");
	u2.setDob("23th july");
	u2.setDoj("10th augest");
	u2.setEmail("aaruundg@gmail");
	u2.setGender("male");
	u2.setSal(560000l);
	UserDefined u3=new UserDefined();
	u3.setId(400);
	u3.setName("rishi");
	u3.setPhono(983459087l);
	u3.setAddress("Thanjavur");
	u3.setDob("14th december");
	u3.setDoj("24th octobert");
	u3.setEmail("visvanathabg@gmail");
	u3.setGender("male");
	u3.setSal(29000l);
	List<UserDefined> l=new ArrayList<>();
	l.add(u);
	l.add(u1);
	l.add(u2);
	l.add(u3);
	for (int i = 0; i <l.size(); i++) {
		int id=l.get(i).getId();
		System.out.println(id);
		String name=l.get(i).getName();
		System.out.println(name);
		String address=l.get(i).getAddress();
		System.out.println(address);
		long phono=l.get(i).getPhono();
		System.out.println(phono);
		String dob=l.get(i).getDob();
		System.out.println(dob);
		String doj=l.get(i).getDoj();
		System.out.println(doj);
		String email=l.get(i).getEmail();
		System.out.println(email);
		String gender=l.get(i).getGender();
		System.out.println(gender);
		long sal=l.get(i).getSal();
		System.out.println(sal);
		
	
		
	}
}
}
