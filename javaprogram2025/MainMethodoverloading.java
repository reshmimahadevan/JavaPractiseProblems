package javaprogram2025;

public class MainMethodoverloading {
	
	//JVM always looks for psvm(String[] parameter)

	public static void main(String[] args) {

		System.out.println("Hello");
		
		MainMethodoverloading.main(2);

	}

	public static void main(int a) {

		System.out.println("Hi " + a);
		
		MainMethodoverloading.main(a,4);

	}
	
	public static void main(int a,int b) {

		System.out.println("Bye " +(a+b));

	}

}
