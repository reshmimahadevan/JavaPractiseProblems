package setconcept;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		
		Set<String> browserSet = new TreeSet<String>();
		browserSet.add("chrome");
		browserSet.add("firefox");
		browserSet.add("ie");
		browserSet.add("opera");
		//Null Pointer Exception - Not able to sort
		//browserSet.add(null);
		System.out.println(browserSet);

		for (String e : browserSet) {
			System.out.println(e);
		}
		
	}

}
