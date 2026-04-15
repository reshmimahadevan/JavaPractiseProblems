package ArrayListAssignment;

import java.util.ArrayList;

//Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop
public class SearchElement {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");

		String searchColor = "Yellow";

		for (String color : al) {
			if (color.equals(searchColor)) {
				System.out.println("Colour Found " + searchColor);
				break;
			}
		}
	}
}
