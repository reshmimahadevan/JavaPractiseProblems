package ArrayListAssignment;

import java.util.ArrayList;

public class ExtractPortionOfArray {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");

		colors.add("Green");

		colors.add("Blue");

		colors.add("Yellow");

		colors.add("Purple");

		ArrayList<String> portion = new ArrayList<>(colors.subList(1, 4));

		System.out.println(portion);

	}

}
