package com.oops.interfacee;

 interface AcBus {
	void Acfeature();
}
 interface Doubledecker{
	 void Doubledecker();
 }
 class Bus implements AcBus, Doubledecker{
	 public void Doubledecker() {
		 System.out.println(" Double decker bus has more seats ");
		 System.out.println("-------------------------------------------------");
	 }
	 public void Acfeature() {
		 System.out.println("Ac bus has the aditional feature ");
		 System.out.println("-------------------------------------------------");
	 }
	
 }

