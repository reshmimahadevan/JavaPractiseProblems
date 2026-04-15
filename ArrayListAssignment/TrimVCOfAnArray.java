package ArrayListAssignment;

import java.util.ArrayList;

//Write a Java program to trim the virtual capacity of an array list the current list size.
public class TrimVCOfAnArray {

	public static void main(String[] args) {

//The "Trim" Command: colors.trimToSize();.
//This method tells Java: "Hey, I'm not going to add any more items. Please cut off the extra empty slots to save memory."
//Final Result: Java kills the 6 empty virtual slots. Now, the Virtual Capacity becomes exactly equal to the Size.
//VC is now 4.
//Size is still 4.

		ArrayList<String> colors = new ArrayList<>(10);
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.trimToSize();
		System.out.println(colors.size());

	}

}
