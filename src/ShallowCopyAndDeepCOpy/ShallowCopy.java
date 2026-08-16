package ShallowCopyAndDeepCOpy;

class Address {

	String city;

	Address(String city) {
		this.city = city;
	}
}

class Student implements Cloneable {

	int number;
	String name;
	Address address;

	Student(int number, String name, Address address) {
		this.number = number;
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCopy {

	public static void main(String[] args) throws Exception {

		Address a = new Address("Hyderabad");

		Student s1 = new Student(7, "Sudheer", a);

		// Shallow Copy
		Student s2 = (Student) s1.clone();

		// Change s2 address
		s2.address.city = "Vizag";

		System.out.println("Student 1 Address : " + s1.address.city);
		System.out.println("Student 2 Address : " + s2.address.city);
	}
}