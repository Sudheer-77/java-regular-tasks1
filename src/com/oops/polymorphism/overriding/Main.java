package com.oops.polymorphism.overriding;

class Main{
public static void main(String []args)
{
	Employee E= new Employee();
	E.work();
	Developer d= new Developer();
	d.work();
	Tester T =new Tester();
	T.work();
	//WE CAN CREATE 2 WAYS :
    //Employee e;
//	 e = new Employee();
//    e.work();
//    e = new Developer();
//    e.work();
//    e = new Tester();
//    e.work();
}

}