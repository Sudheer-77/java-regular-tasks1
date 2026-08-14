package com.oops.Inheritance.Hybrid;

interface AcFeature {
	void ac();
	}
interface Doubledecker{
	void doubledecker();
}
public class Vechile {
void start()
{
	System.out.println(" vechile Start");
}
}
class Bus extends Vechile implements AcFeature
{
	void pubicTranceport()
	{
		System.out.println(" bus is a public transport");
	}

	@Override
	public void ac() {
		System.out.println(" its also has ac feature");
		
	}
}
class ElectricBus extends Bus implements Doubledecker{
	public void doubledecker()
	{
		System.out.println("double decker has more seates");
	}
	void charg() {
		System.out.println(" electric bus has the charging features");
	}
}
class Acbus extends Bus implements AcFeature{
	public void ac() {
		System.out.println(" Ac bus has dditionAL features");
	}
}