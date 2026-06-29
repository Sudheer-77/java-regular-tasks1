package Constructor;

public class Noargconstructor {
	int trainNumber;
	String trainName;
	String source;
	String destination;

	Noargconstructor() {
		trainNumber = 10123;
		trainName = "durg";
		source = "vizag";
		destination = "hyd";
	}

	public static void main(String[] args) {

		Noargconstructor e = new Noargconstructor();
		e.display();
		Noargconstructor e2 = new Noargconstructor();
		e2.display();
		Noargconstructor e3 = new Noargconstructor();
		e3.display();

	}

	void display() {
		System.out.println("train number :" + trainNumber);
		System.out.println("train name is :" + trainName);
		System.out.println("source : " + source);
		System.out.println("destination :" + destination);
		System.out.println("**********************************");
	}
}
