package Constructor;

public class ConstructorChaining {
	int buildingId;
	String buildingName;
	String buildingType;
	String address;
	int numberOfFloors;
	int totalRooms;
	int totalApartments;
	double height;
	double area;
	int constructionYear;

	ConstructorChaining() {
		int buildingId;
		String buildingName;
		String buildingType;
		String address;
		int numberOfFloors;
		int totalRooms;
		int totalApartments;
		double height;
		double area;
		int constructionYear;

	}

	public ConstructorChaining(int buildingId, String buildingName, int numberOfFloors, int totalRooms) {
		
		this.buildingId = buildingId;
		this.buildingName = buildingName;
		this.numberOfFloors = numberOfFloors;
		this.totalRooms = totalRooms;
	}

	public ConstructorChaining(int buildingId, String buildingName, int numberOfFloors, int totalRooms,
			int totalApartments) {

		this.buildingId = buildingId;
		this.buildingName = buildingName;
		this.numberOfFloors = numberOfFloors;
		this.totalRooms = totalRooms;
		this.totalApartments = totalApartments;
	}

	public ConstructorChaining(int buildingId, String buildingName, String buildingType, String address,
			int numberOfFloors, int totalRooms, int totalApartments, double height, double area, int constructionYear) {
		super();
		this.buildingId = buildingId;
		this.buildingName = buildingName;
		this.buildingType = buildingType;
		this.address = address;
		this.numberOfFloors = numberOfFloors;
		this.totalRooms = totalRooms;
		this.totalApartments = totalApartments;
		this.height = height;
		this.area = area;
		this.constructionYear = constructionYear;
	}

	public ConstructorChaining(int totalApartments, double height, int constructionYear) {

		this.totalApartments = totalApartments;
		this.height = height;
		this.constructionYear = constructionYear; 
	}

	public ConstructorChaining(int numberOfFloors, int totalApartments, int constructionYear) {

		this.numberOfFloors = numberOfFloors;
		this.totalApartments = totalApartments;
		this.constructionYear = constructionYear;
	}

	public static void main(String args[]) {
		System.out.println("hello");
	}

	class biuldings extends ConstructorChaining {
		public static void main(String[] args) {
			ConstructorChaining c = new ConstructorChaining();
			c.details();
			ConstructorChaining c1 = new ConstructorChaining(101, "sampath vinayaka", 20, 3, 12);
			c1.details();
			ConstructorChaining c2 = new ConstructorChaining(102, "bojja vinayaka", 20, 3);
			c2.details();
			ConstructorChaining c3 = new ConstructorChaining(102, "bojja vinayaka", 20, 3);
			c3.details();
			ConstructorChaining c4 = new ConstructorChaining(151, 20, 3);
			c4.details();
		}

	}

	void details() {
		System.out.println("buildingId :" + this.buildingId);
		System.out.println("buildingName :" + this.buildingName);
		System.out.println("buildingType :" + this.buildingType);
		System.out.println("address :" + this.address);
		System.out.println("numberOfFloors : " + this.numberOfFloors);
		System.out.println("totalApartments :" + this.totalApartments);
		System.out.println("height  :" + this.height);
		System.out.println("area :" + this.area);
		System.out.println("constructionYear :" + this.constructionYear);
		System.out.println("*****************************************");

	}

}
