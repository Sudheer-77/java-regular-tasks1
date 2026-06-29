package Constructor;

public class busCopyCONS {
	int busNumber;
	String busName;
	String busType;
	String source;
	String destination;
	int seatingCapacity;
	int availableSeats;
	double ticketPrice;
	String driverName;
	String conductorName;

	busCopyCONS() {
		System.out.println("No arg cons called");
	}

	public busCopyCONS(int busNumber) {
		System.out.println("1 arf con called");

		this.busNumber = busNumber;
	}

	public busCopyCONS(busCopyCONS a, String busName) {
		System.out.println("2 arg cons called");

		this.busNumber = a.busNumber;
		this.busName = busName;
	}

	public busCopyCONS(busCopyCONS a, String busType, String source) {
		System.out.println(" 3 arg ");
		this.busNumber = a.busNumber;
		this.busName = a.busName;
		this.busType = busType;
		this.source = source;
	}

	public busCopyCONS(busCopyCONS a, String destination, int seatingCapacity, int availableSeats, double ticketPrice,
			String driverName, String conductorName) {
		System.out.println("4 arg cons");
		this.busNumber = a.busNumber;
		this.busName = a.busName;
		this.busType = a.busType;
		this.source = a.source;
		this.destination = destination;
		this.seatingCapacity = seatingCapacity;
		this.availableSeats = availableSeats;
		this.ticketPrice = ticketPrice;
		this.driverName = driverName;
		this.conductorName = conductorName;
	}

	public static void main(String[] args) {

		busCopyCONS b = new busCopyCONS();
		b.display();
		busCopyCONS b1 = new busCopyCONS(12312);
		b1.display();

		busCopyCONS b2 = new busCopyCONS(b1, "redbus");
		b2.display();
		busCopyCONS b3 = new busCopyCONS(b2, "volvov", "vizag");
		b3.display();
		busCopyCONS b4 = new busCopyCONS(b3, "hyd", 40, 23, 1500, "ramachandra", "krishna");
		b4.display();
	}

	void display() {
		System.out.println("busNumber :" + busNumber);
		System.out.println("busName :" + busName);
		System.out.println("busType :" + busType);
		System.out.println("source :" + source);
		System.out.println("destination :" + destination);
		System.out.println("seatingCapacity :" + seatingCapacity);
		System.out.println("availableSeats :" + availableSeats);
		System.out.println("ticketPrice :" + ticketPrice);
		System.out.println("driverName :" + driverName);
		System.out.println("conductorName :" + conductorName);
		System.out.println("*****************************************");

	}
}
