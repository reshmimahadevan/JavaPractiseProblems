package stringmanipulationconcept;

public class StringCompare {

	public static void main(String[] args) {

		// String Literals
		String s1 = "hello selenium";

		// Using new as String is a class
		String s2 = new String("hello selenium");

		String s3 = "hello selenium";
		
		System.out.println(s1 == s2); // Checking object references in the memory - false

		System.out.println(s1 == s3); // Constant pool objects pointing to the same name - true

		System.out.println(s1.equals(s2));// Checks the content - true

		String s4 = "hello Selenium";

		System.out.println(s1 == s4); // Constant pool objects create new entry -case sensitive - false

		System.out.println(s1.equalsIgnoreCase(s4)); // true - after ignoring case

		// Refer onedrive - Interview Question
		// 2 values will be created in the memory -Heap + SCP
		String str = new String("testing");

		// 0 object created - as already created in SCP - no duplicate values allowed
		String st = "testing";

		// 1 object - SCP
		String st1 = "Testing";

		// Strings are immutable coz if not assigned to any variable it will create a
		// new entry in heap memory so String buffer and String Builder come to the
		// picture
		String t1 = "hello";
		t1 = t1.concat("automation");
		// System.out.println(t1.concat("automation")); // helloautomation - pointed by
		// no one in SCP
		// System.out.println(t1); // hello
		System.out.println(t1); // helloautomation

		String t2 = "helloautomation"; // Pointed by t2
		System.out.println(t1.equals(t2)); // true - as content is same but if t1 is not assigned to contact the the o/p
											// is false

	}

}
