//ANONYMOUS
class Student4 {
	String name="sudheer";
	@Override
	protected void finalize() {
		System.out.println("object is destroyed");
	}
	public static void main(String []args) {
		
System.out.println("Main method ened");
System.out.println(new Student4().name);
System.gc();

}
}