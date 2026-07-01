package Casestudy;

public class OnlineShoppingPlatform {
	int product_id;
	String product_name;
	String brand;
	double price;
	String warranty;
	String region;

	OnlineShoppingPlatform() {
		System.out.println("No arg consructor called");
	}

	public OnlineShoppingPlatform(int product_id, String product_name, String brand, double price, String warranty) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
	}

	OnlineShoppingPlatform(OnlineShoppingPlatform oldmodel, String region)

	{
		this.product_id = oldmodel.product_id;
		this.product_name = oldmodel.product_name;
		this.brand = oldmodel.brand;
		this.price = oldmodel.price;
		this.warranty = oldmodel.warranty;
		this.region = region;

	}

	public static void main(String[] args) {
		OnlineShoppingPlatform sh = new OnlineShoppingPlatform(98543, "Samsung Galaxy S26 Ultra 5G", "Samsung", 123000,
				"2 years");
		OnlineShoppingPlatform sh2 = new OnlineShoppingPlatform(sh, "HYDERABAD");

		sh.display();
		sh2.display2();

	}

	void display() {

		System.out.println("product id is:" + product_id);
		System.out.println("product product_name is:" + product_name);
		System.out.println("product brand is:" + brand);
		System.out.println("product  price is:" + price);
		System.out.println(" product warranty is " + warranty);
		
		System.out.println("___________________________________________________________");

	}
	void display2() {

		System.out.println("product id is:" + product_id);
		System.out.println("product product_name is:" + product_name);
		System.out.println("product brand is:" + brand);
		System.out.println("product  price is:" + price);
		System.out.println(" product warranty is " + warranty);
		System.out.println("region is" + region);
		System.out.println("___________________________________________________________");

	}
}
