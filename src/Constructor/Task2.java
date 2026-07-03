package Constructor;

public class Task2 {

    int carId;
    String brand;
    String model;
    String color;
    double price;
    String fuelType;
    String transmission;

    Task2() {
        this(121, "MRF");
    }

    Task2(int carId, String brand) {
        this(carId, brand, "2.0F");
    }

    Task2(int carId, String brand, String model) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Car Id      : " + carId);
        System.out.println("Brand       : " + brand);
        System.out.println("Model       : " + model);
        System.out.println("Color       : " + color);
        System.out.println("Price       : " + price);
    }

    // Pass this as argument to method
    void passObject(Task2 t) {//
        System.out.println("Received Object Brand: " + t.brand);
    }

    void sendObject() {//
        passObject(this);
    }

    // Return current object
    Task2 getObject() {//
        return this;
    }

    public static void main(String[] args) {

        Task2 t = new Task2();
        Task2 t2 = new Task2(121, "MRF");
        Task2 t3 = new Task2(121, "CEAT", "5th Edition");

        t.display();
        t2.display();
        t3.display();

        t3.sendObject();//

        Task2 obj = t3.getObject();//
        System.out.println(obj==t);
        System.out.println("Returned Object Brand: " + obj.brand);
    }
}

class Child extends Task2 {

    int carId = 65;

    Child() {
        super();
    }

    void show() {

        
        System.out.println("Child carId  : " + this.carId);


        System.out.println("Parent carId : " + super.carId);


        System.out.println("Current Object: " + this);
    }

    public static void main(String[] args) {

        Child c = new Child();
        c.show();
    }
}