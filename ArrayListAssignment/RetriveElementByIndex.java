package ArrayListAssignment;

import java.util.ArrayList;

public class RetriveElementByIndex {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");
	    String colour = al.get(2);
	    System.out.println(colour);
	}

}
