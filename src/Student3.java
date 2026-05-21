//scope 
 class Student3 {
	 @Override
	protected void finalize() {
		 System.out.println("finalize");
	}

	
void show() {
	Student3  st=new Student3();
	System.out.println("hi");
}
public static void main(String []args) {
	Student3  st1=new Student3();

	st1.show();
	System.gc();
}
}
