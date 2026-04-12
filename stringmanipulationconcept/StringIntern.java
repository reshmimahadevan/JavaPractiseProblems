package stringmanipulationconcept;

public class StringIntern {

	public static void main(String args[]) {
		String s = new String("hello java"); // 1-Heap/1-SCP

		// Give a reference for the value in SCP which are not having refrences
		// If no refrences are linked then it will be ready for GC that's why intern is used

		String s1 = s.intern();

		String s2 = s.intern();

		// You can write this as well but it points to heap and the hello java created in SCP will be ready for GC
		// Intern refers to SCP

		// String s1 = s;

		System.out.println(s1);
		System.out.println(s);

		// == will be true only if it points to same SCP -> IMPORTANT

		System.out.println(s == s1); // false
		System.out.println(s1 == s2);// true
		System.out.println(s.equals(s1)); // true
	}

}
