package com.oops.abstraction.BANK;

public  class AXIS implements bank {
	@Override 
	public void deposit() 
	{ 
		System.out.println("Axis: Amount deposited");
	}
	@Override
	public  void checkBalance()
	{
		System.out.println(" Axis:checking balance");
		
	}
	@Override
	public   void withdral()
	{
		System.out.println(" Axis:withdral succesful");
	}

}
