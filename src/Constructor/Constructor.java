package Constructor;

public class Constructor {
	
	String model;
	String brand;
	int speed;
	int milage;
	
	
	Constructor(String model,String brand,int speed,int milage)
	{
		
		this.model= model;
		this.brand= brand;
		this.speed=speed;
	this.milage= milage;
	
	}
	Constructor(String model,String brand)
	{
	this.brand=brand;
	this.model=model;
	}

	public static void main(String[] args) {
		
		Constructor c = new Constructor("a4","audi",210,12);
		Constructor c1 = new Constructor("a5","audi1");
		c. display();
		c1.display();
	

	}
	void display() {
		System.out.println("model is "+model);
		System.out.println("brand is "+brand);
		System.out.println(" speed of car is "+speed);
		System.out.println(" milage"+milage);
	}

}
