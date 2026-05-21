
public class Product {

	

int productid ;
String productname;
double productprice;
static String storename ="sksstore";
{
	System.out.println(storename);
}

 void details(){

	System.out.println("productid:"+productid);
	System.out.println("productname:"+productname);
	System.out.println("productprice:"+productprice);
	System.out.println("\n");
}
 public static void main (String []args)
 {
	 
	 Product pr= new Product();
	 
	 pr.productid =123;
     pr.productname =" choki";
	 pr.productprice=12;
	 pr.details();
	
	 Product pr1= new Product();
	
	 pr1.productid =1234;
	 pr1.productname = "water";
	 pr1.productprice=12;
	 pr1.details();
	 
	 Product pr2= new Product();

	 pr2.productid =12345;
	 pr2.productname =" cock";
	 pr2.productprice=12;
	 pr2.details();
	


	 
 }
}
