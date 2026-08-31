package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo13 {

	public static void main(String[] args) {

		List<String> teamA = new ArrayList<>();
		teamA.add("sandeep");
		teamA.add("Dhoni");
		teamA.add("sudheer");
		teamA.add("Soorya");
		teamA.add("iyer");
		System.out.println("*******************");
		System.out.println(teamA);

		List<String> teamB = new ArrayList<>();
		teamB.add("Gill");
		teamB.add("jadeja");
		teamB.add("Hardhik");
		teamB.add("Rohit");
		teamB.add("Sanju");
		System.out.println("*******************");
		System.out.println(teamB);

		List<String> teamC = new ArrayList<>();

		teamC.add("Abhishek");
		teamC.add("Ishan");
		teamC.add("Gaikwad");
		System.out.println("*******************");
		System.out.println(teamC);

		List<String> teamD = new ArrayList<>();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		teamD.addAll(teamA);
		teamD.addAll(teamB);
		teamD.addAll(1, teamC);

		System.out.println(teamD);
		System.out.println("                                 ");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");

		for (int i = 0; i < teamD.size(); i++) {
			System.out.println(teamD.get(i));//we can use by get by using get and also ny converting the Collection into array
		}
		System.out.println(teamA.indexOf("sudheer"));
		System.out.println(teamA.lastIndexOf("sudheer"));

		
		System.out.println(teamD.indexOf("sudheer"));
		System.out.println(teamD.lastIndexOf("sudheer"));
		System.out.println("***************************");
		System.out.println(teamC.indexOf("sudheer"));
		System.out.println(teamC.lastIndexOf("sudheer"));
		
		teamD.remove("Abhishek");
		System.out.println("***************************");
		System.out.println(teamD);


	}

}