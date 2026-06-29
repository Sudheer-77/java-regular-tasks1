package Constructor;

public class thisoff {

	int cid;
	String cname;
	int age;
	char gen;
	long phone;

	public thisoff() {
		this(100, "unknown"); // Calling two arg constructor in no arg constructor
//		this(cid, cname, 10);// Calling three Constructor in two arg constructor
		System.out.println("no arg constructor !");
	}

	public thisoff(int cid, String cname) {
		this(cid, cname, 10);// Calling three Constructor in two arg constructor
	}

	public thisoff(int cid, String cname, int age) {
		this.cid = cid;
		this.cname = cname;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		thisoff c1 = new thisoff();
		c1.cusInfo();

		thisoff c2 = new thisoff(101, "Srikanth");
		c2.cusInfo();
//
		thisoff c3 = new thisoff(102, "Abhishek", 22);
		c3.cusInfo();

		System.out.println("main method ended ");

	}

	void cusInfo() {
		System.out.println("CID : " + cid);
		System.out.println("Name: " + cname);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gen);
		System.out.println("Phone Number: " + phone);
		System.out.println("---------------------------------");

	}

}