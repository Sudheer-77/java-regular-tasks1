package com.oops.Inheritance.Hierarchical;

public class WildAnimals {
	void hunting() {
		System.out.println(" ALL THE WILD ANIMALS ARE HAVE THE HUNTING SKILLS");
	}
	void running() {
		System.out.println(" all the wind animal will run fastly");
	}
	class Lion extends WildAnimals{
		void paw()
		{
			System.out.println("Lion has the high paw power");
		}
	}
	class Tiger extends WildAnimals{
		void attaking()
		{
			System.out.println("Tiger has the high attaking akills");
		}
	}
}

