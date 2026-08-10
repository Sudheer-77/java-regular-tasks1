package ShallowCopy;

class Student implements Cloneable {

	int number;
	String name;
	Address address;

	public Student(int number, String name, Address address) {
		this.number = number;
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // Shallow Copy
	}
}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class Main {

	public static void main(String[] args) throws Exception {

		Address a = new Address("Hyderabad");

		Student s1 = new Student(7, "Sudheer", a);

		Student s2 = (Student) s1.clone();

		s2.address.city = "Vizag";

		System.out.println(s1.address.city);
		System.out.println(s2.address.city);
	}
}