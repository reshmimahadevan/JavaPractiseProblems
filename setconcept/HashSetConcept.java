package setconcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {

		//Does not maintain order
		Set<String> browserSet = new HashSet<String>(); // vc=16
		browserSet.add("chrome");
		browserSet.add("firefox");
		browserSet.add("ie");
		browserSet.add("edge");
		browserSet.add("chrome");
		browserSet.add(null);
		browserSet.add(null);

		// No duplicates allowed
		System.out.println(browserSet);
		
		System.out.println(browserSet.contains("chrome"));
		System.out.println(browserSet.contains("safari"));

		// No index - so traverse
		System.out.println("Using For Loop");
		System.out.println("==============");
		for (String e : browserSet) {
			System.out.println(e);
		}
		
		System.out.println("Using Lambda");
		System.out.println("==============");
		browserSet.forEach(e -> System.out.println(e));

		// Or use iterator
		//Duplicate nulls allowed
		
		System.out.println("Using Iterator");
		System.out.println("==============");
		Iterator<String> it = browserSet.iterator();

		while (it.hasNext()) {
			String br = it.next();
			System.out.println(br);
		}
		
		//Set to List
		List<String> browserList = new ArrayList<String>(browserSet);
		System.out.println(browserList.get(0));
		System.out.println("Set to List");
		System.out.println("==============");
		System.out.println(browserList);
		

//		String b1 = it.next();
//		System.out.println(b1); // edge

//		String b2 = it.next();
//		System.out.println(b2); // chrome

	}

}
