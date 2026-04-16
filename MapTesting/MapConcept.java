package MapTesting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapConcept {

	public static void main(String[] args) {

		// Collection : <key,value>
		// HashMap(C) --- > Map (I)
		// No order based
		// Any combination of datatypes can be written
		// The Rule in HashMap:
		// Keys Values
		// Null allowed? ✅ Yes, but only ONE ✅ Yes, multiple
		// Why? Keys must be unique Values have no uniqueness constraint
		// If you have null at key it will be stored at 1st position

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Chrome", 101);
		hm.put("Firefox", 96);
		hm.put("Edge", 111);
		// Many null keys can be added but only null key can be maintianed(latest value)
		hm.put(null, 123);
		hm.put(null, 80);
		hm.put("Safari", null);
		hm.put("Opera", null);
		hm.put(null, null);
		// hm.put("IE", " "); String is dt in value and if we provide value as " " ->
		// output is null
		hm.put(" ", 60);
		hm.put("Chrome", 80);

		System.out.println(hm.get("Chrome")); // 101
		System.out.println(hm.get("chrome")); // null
		System.out.println(hm.get(null));
		System.out.println(hm.get("Safari"));
		System.out.println(hm.get("Opera"));
		System.out.println(hm.get(null));
		System.out.println(hm.get(" "));
		System.out.println(hm);
		System.out.println("-------------------");

		//For loop - since its not indexed based
		for (Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("-------------------");
		
		//foreach using Lambda
		hm.forEach((k,v)->System.out.println(k + " : " + v));
		System.out.println("-------------------");
		

		// LinkedHashMap - Maintains Insertion Order
		Map<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		hm1.put("Chrome", 101);
		hm1.put("Firefox", 96);
		hm1.put("Edge", 111);
		// Many null keys can be added but only null key can be maintianed(latest value)
		hm1.put(null, 123);
		hm1.put(null, 80);
		hm1.put("Safari", null);
		hm1.put("Opera", null);
		hm1.put(null, null);
		// hm.put("IE", " "); String is dt in value and if we provide value as " " ->
		// output is null
		hm1.put(" ", 60);
		hm1.put("Chrome", 80);
		System.out.println(hm1);

		// TreeMap - Maintains Sorted Order
		Map<String, Integer> hm2 = new TreeMap<String, Integer>();
		hm2.put("Chrome", 101);
		hm2.put("Firefox", 96);
		hm2.put("Edge", 111);
		hm2.put("efgs", 88);
		hm2.put(" ", 60);
		hm2.put("Chrome", 80);
		// Null Key not allowed in Tree Map - Null Pointer Exception
		// hm2.put(null, 90);
		System.out.println(hm2);

	}

}
