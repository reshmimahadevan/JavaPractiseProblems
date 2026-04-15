package ArrayListAssignment;

import java.util.ArrayList;

public class EmptyAnArray {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.clear();
		System.out.println(colors);

	}

}
