package stringmanipulationconcept;

public class StringBuilderandStringBuffer {

	public static void main(String args[]) {
		
		// String Builder
		StringBuilder b = new StringBuilder();
		b.append("automation");
		System.out.println(b);
		System.out.println(b.reverse());
		
		//String Buffer - Tread safe
		String b1 = "hey";
		//b1.reverse(); method not available
	}
}
