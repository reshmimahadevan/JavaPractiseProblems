package javaassignment2025;

public class ClassBasics {

	String name;

	public static void main(String args[]) {
		ClassBasics c1 = new ClassBasics();
		c1.name = "A";

		ClassBasics c2 = new ClassBasics();
		c2.name = "B";

		ClassBasics c3 = new ClassBasics();
		c3.name = "C";

		ClassBasics c4 = new ClassBasics();
		c4.name = "D";

		System.out.println(c1.name + " " + c2.name + " " + c3.name + " " + c4.name);

		c1 = c2;
		System.out.println(c1.name + " " + c2.name + " " + c3.name + " " + c4.name);

		c2 = c3;
		System.out.println(c1.name + " " + c2.name + " " + c3.name + " " + c4.name);

		c3 = c4;
		System.out.println(c1.name + " " + c2.name + " " + c3.name + " " + c4.name);

		c4 = c1;
		System.out.println(c1.name + " " + c2.name + " " + c3.name + " " + c4.name);
	}

}
