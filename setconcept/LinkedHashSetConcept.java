package setconcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetConcept {

	public static void main(String[] args) {

		// LinkedHasSet - same way you add the same way the output displays - Eg:Adding Months
		Set<String> browserSet = new LinkedHashSet<String>();
		browserSet.add("chrome");
		browserSet.add("firefox");
		browserSet.add("ie");
		browserSet.add("opera");
		//Latest null will be taken
		browserSet.add(null);
		browserSet.add(null);
		System.out.println(browserSet);

		for (String e : browserSet) {
			System.out.println(e);
		}
		
		//Set to List
		List<String> browserList = new ArrayList<String>(browserSet);
		System.out.println(browserList);

	}

}
