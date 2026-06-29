package Constructor;

class ConstructorChaining2 {

	int buildingId;
	String buildingName;
	int numberOfFloors; 
	int totalRooms;
	int totalApartments;

	ConstructorChaining2() {
		this(101, "Sampath Vinayaka");
	}

	ConstructorChaining2(int buildingId, String buildingName) {
		this(buildingId, buildingName, 10);
	}

	ConstructorChaining2(int buildingId, String buildingName, int numberOfFloors) {
		this(buildingId, buildingName, numberOfFloors, 50);
	}

	ConstructorChaining2(int buildingId, String buildingName, int numberOfFloors, int totalRooms) {
		this(buildingId, buildingName, numberOfFloors, totalRooms, 20);
	}

	ConstructorChaining2(int buildingId, String buildingName, int numberOfFloors, int totalRooms, int totalApartments) {
		this.buildingId = buildingId;
		this.buildingName = buildingName;
		this.numberOfFloors = numberOfFloors;
		this.totalRooms = totalRooms; 
		this.totalApartments = totalApartments;
	}

	void details() {
		System.out.println(buildingId);
		System.out.println(buildingName);
		System.out.println(numberOfFloors);
		System.out.println(totalRooms);
		System.out.println(totalApartments);
	}

	public static void main(String[] args) {
		ConstructorChaining2 c = new ConstructorChaining2();
		c.details();
		ConstructorChaining2 c1 = new ConstructorChaining2(102,"DSK");
		c1.details();
		ConstructorChaining2 c2 = new ConstructorChaining2(111,"asdads",23);
		c2.details();
	}
}