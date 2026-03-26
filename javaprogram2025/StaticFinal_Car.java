package javaprogram2025;

public class StaticFinal_Car {

	String name;
	int price;
	String modelnumber;
	static final int wheels = 4;
	static int keys = 2;

	public static void main(String args[]) {
		// Local variables cannot be static
		// static int p = 10;

		StaticFinal_Car f1 = new StaticFinal_Car();
		f1.name = "BMW";
		f1.price = 40;
		f1.modelnumber = "A8";

		StaticFinal_Car f2 = new StaticFinal_Car();
		f2.name = "Honda";
		f2.price = 30;
		f2.modelnumber = "Civic";

		// Static variable access
		// 1.Using class name
		System.out.println(StaticFinal_Car.wheels);

		// 2.Directly
		System.out.println(wheels);

		// Can be accessed using object reference also but not recommended
        // f1.keys = 3;
        // System.out.println(f1.name + " " + f1.price + " " + f1.modelnumber + " " + wheels + " " + f1.keys);

		System.out.println(f1.name + " " + f1.price + " " + f1.modelnumber + " " + wheels + " " + StaticFinal_Car.keys);

		// Without final keys value can be manipulated so its better to use final
		// keyword for static variable
		StaticFinal_Car.keys = 6;
		System.out.println(f1.name + " " + f1.price + " " + f1.modelnumber + " " + wheels + " " + StaticFinal_Car.keys);

	}

}
