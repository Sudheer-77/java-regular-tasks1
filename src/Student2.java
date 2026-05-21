
//island of isolation
class Student2{
	Student2 i;
	@Override
	protected void finalize() {
		System.out.println("finalize ");
	}

	public static void main(String[] args) {
		System.out.println("main method ened");
		Student2 s1= new Student2();
		Student2 s2= new Student2();
		Student2 s3= new Student2();
		
		
		s1.i=s3;
		s2.i=s1;
		s3.i=s2;
		
//		s1.Student2=s3;
//		s2.Student2=s1;
//		s3.Student2=s2;
		
//		System.gc();
		s1=null;
		s2=null;
    	s3=null;
    	System.gc();
	
		
		

	}

}
