package Constructor;

public class Testconstructor {

    int vechileno;
    int noofseats;
    String bus;

    Testconstructor() {
        this(12, 12);
        System.out.println("parent no arg constructor called");
    }

    Testconstructor(int vechileno, int noofseats) {
        this(vechileno, noofseats, "bus");
        System.out.println("parent 2 parameter constructor called");
    }

    Testconstructor(int vechileno, int noofseats, String bus) {
        System.out.println("parent 3 parameter constructor called");
        this.vechileno = vechileno;
        this.noofseats = noofseats;
        this.bus = bus;
    }

    public static void main(String[] args) {

        Testconstructor t = new Testconstructor();
        t.display();
        
        Testconstructor t2 = new Testconstructor(121, 212);

     

        Testconstructor t3 = new Testconstructor(102, 21, "redbus");
     
    }
    void display()
	{
		System.out.println(" vechileno "+vechileno);
		System.out.println(" noofseats "+noofseats);
		System.out.println(" bus "+bus);
	}
}
class car extends Testconstructor
{
	car(){
		System.out.println("child calss no arg");
	}
	
	car(int vechileno,int noofseats){
		super( vechileno, noofseats);
		System.out.println("2 parameter con called");
		this.vechileno=vechileno;
		this.noofseats=noofseats;
		
	}
	public static void main (String []args)
	{
		System.out.println("child class main called");
		car c= new car();
		c. display();
		car c1= new car(12,122);
		c1. display();
	}
	
	void display()
	{
		System.out.println(" vechileno "+vechileno);
		System.out.println(" noofseats "+noofseats);
		System.out.println(" bus "+bus);
	}
}

