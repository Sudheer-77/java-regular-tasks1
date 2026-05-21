
class Student1 {
	String name="sudheer";
	@Override
	protected void finalize() {
		System.out.println("object is destroyed");
	}
	public static void main(String []args) {
		
		
		Student1 s2= new Student1();
		Student1 s4= new Student1();
		Student1 s3= new Student1();
		s3=null;
		//nullifing
		s2=s4;
		//reassignning
		System.gc();
	
		
		
	
System.out.println("Main method ened");

System.gc();

}
}