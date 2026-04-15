package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");

		Collections.reverse(studentNames);
		System.out.println(studentNames);

		ArrayList<String> reversedList = new ArrayList<>();

	    //Start from the last index and move backwards
		for (int i = studentNames.size() - 1; i >= 0; i--) {
			reversedList.add(studentNames.get(i));
		}

		System.out.println("Reversed using for loop: " + reversedList);

		ArrayList<String> reversedList1 = new ArrayList<>();

		// Iterate forward, but always add to the front
		// Visualizing the process:
		// Step 1: Grab "Varun" -> Add to index 0[Varun]
		// Step 2: Grab "Reena" -> Add to index 0 [Reena, Varun]
		// Step 3: Grab "Naveen" -> Add to index 0 [Naveen, Reena, Varun]
		// By the time the loop finishes, the last item grabbed ("Peter") is at the very front.

		for (String color : studentNames) {
			reversedList1.add(0, color);
		}

		System.out.println("Reversed using for-each: " + reversedList1);
	}
}
