package javaprogram2025;

public class CallByReference {

	String name;
	int age;

	public void m1(int a) {
		System.out.println(a);
	}

	public static void t1(CallByReference p1) {
		p1.m1(3);
		System.out.println(p1.name); // Reshmi
		System.out.println(p1.age); // 27

		p1.name = "Bhavika";
		p1.age = 2;
		
		//t2(p1);

	}

	public static void t2(CallByReference p2) {
		p2.m1(4);
		System.out.println(p2.name); // Sudha
		System.out.println(p2.age); // 54

	}

	public static void main(String[] args) {

		CallByReference c1 = new CallByReference();

		System.out.println(c1.name); // Null
		System.out.println(c1.age); // 0

		c1.m1(20); // Call By Value //20

		c1.name = "Reshmi";
		c1.age = 27;

		CallByReference.t1(c1);

		// Interview Question : Why the value getting changed here? because p1 and obj
		// pointing to the same reference so we can change (refer the diagram in
		// Onedrive
		// name CallByReference) obj still exists

		System.out.println(c1.name); // Bhavika
		System.out.println(c1.age); // 2

		c1.name = "Sudha";
		c1.age = 54;

		CallByReference.t2(c1);

	}

}
