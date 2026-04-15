package ArrayListAssignment;

import java.util.ArrayList;

//Write a Java program to remove the third element from an array list
public class RemoveElement {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");
		
		al.remove(2);
		System.out.println(al);

	}

}
