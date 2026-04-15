package ArrayListAssignment;

import java.util.ArrayList;

public class UpdateIndex {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");
		// set() returns the old value, not the new one — it's designed this way so you
		// have a chance to keep a reference to whatever got replaced - So output will be green
		// String colour = al.set(2, "Pink");
		// System.out.println(colour);
		
		al.set(2, "Pink");
		System.out.println(al.get(2)); // Pink

	}

}
