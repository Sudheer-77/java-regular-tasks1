package typesOfMethods;

public class LabTasks {
	
	LabTasks(){
		System.out.println("constructor call");
	}
	

	public static void main(String args[]) {
		System.out.println("hello");
		LabTasks L =new LabTasks ();
	}
	{
		System.out.println("instance block");
	}
}
