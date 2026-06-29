package Constructor;

public class Fooddelivery {
	int orderid;
	String customerName;
	String restarentName;
	String foodname;
	int quantity;
	double price;

	Fooddelivery(int orderid, String customerName, String restarentName, String foodname, int quantity, double price) {
		System.out.println("6 parametariged constructor");
		this.orderid = orderid;
		this.customerName = customerName;
		this.restarentName = restarentName;
		this.foodname = foodname;
		this.quantity = quantity;
		this.price = price;
	}

	Fooddelivery(int orderid, String restarentName, String foodname, int quantity, double price) {
		System.out.println("5 parametariged constructor");
		this.orderid = orderid;

		this.restarentName = restarentName;
		this.foodname = foodname;
		this.quantity = quantity;
		this.price = price;
	}

	Fooddelivery(int orderid, String restarentName, String foodname, double price) {
		System.out.println("4 parametariged constructor");
		this.orderid = orderid;

		this.restarentName = restarentName;
		this.foodname = foodname;

		this.price = price;
	}

	Fooddelivery() {

	}

	Fooddelivery(String restarentName) {
		this.restarentName = restarentName;
	}

	Fooddelivery(int orderid, String restarentName) {
		this.orderid = orderid;
		this.restarentName = restarentName;
	}

	Fooddelivery(int orderid, String restarentName, double price) {
		System.out.println("3 parametariged constructor");
		this.orderid = orderid;
		this.restarentName = restarentName;
		this.price = price;
	}

	public static void main(String[] args) {
		Fooddelivery f = new Fooddelivery(1, "sudheer", "mefil", "biriyani", 2, 540);
		f.fooditems();
		Fooddelivery f1 = new Fooddelivery(2, "suri", "mefil", "biriyani", 3, 740);
		f1.fooditems();
		Fooddelivery f2 = new Fooddelivery(3, "mefil", "biriyani", 740);
		f2.fooditems();
		Fooddelivery f3 = new Fooddelivery();
		f3.fooditems();
		Fooddelivery f4 = new Fooddelivery("bavarchi");
		f4.fooditems();
		Fooddelivery f5 = new Fooddelivery(4, "bavarchi");
		f5.fooditems();
		Fooddelivery f6 = new Fooddelivery(4, "bavarchi", 800);
		f6.fooditems();

	}

	void fooditems() {
		System.out.println("customer name :" + customerName);
		System.out.println(" restarentname :" + restarentName);
		System.out.println(" foodname :" + foodname);
		System.out.println(" quantity :" + quantity);
		System.out.println(" price :" + price);
		System.out.println("orderid :" + orderid);
	}

}