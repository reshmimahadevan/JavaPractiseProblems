package accessmodifier1;

import accessmodifier.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		//Different package subclass
		//Private Default not allowed
		//Only public protected allowed
		Audi a = new Audi();
		a.color="Blue";
		a.price=40000;
		
		//Car c= new Car(); //Protected Constructor cannot be accessed  from a different package parent class 
		
	}

}
