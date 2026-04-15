package ArrayListAssignment;

import java.util.ArrayList;

public class PrintElements {

	public static void main(String[] args) {
		
		 ArrayList<String> colors = new ArrayList<>();
		 colors.add("Red");
		 colors.add("Green");
		 colors.add("Blue");
		 colors.add("Yellow");
		 
		 for(int i=0;i <= colors.size()-1;i++)
		 {
			 System.out.println("Element at index " +i+ " is " +colors.get(i));
		 }

	}

}
