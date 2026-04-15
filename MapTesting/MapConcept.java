package MapTesting;

import java.util.HashMap;

public class MapConcept {

	public static void main(String[] args) {

		// Collection : <key,value>
		// HashMap(C) --- > Map (I)
		// No order based
		// Any combination of datatypes can be written
		// The Rule in HashMap:
		//                  Keys               Values
		// Null allowed? ✅ Yes, but only ONE ✅ Yes, multiple
		// Why?          Keys must be unique  Values have no uniqueness constraint
		//If you have null at key it will be stored at 1st position
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Chrome", 101);
		hm.put("Firefox", 96);
		hm.put("Edge", 111);
		// Many null keys can be added but only null key can be maintianed(latest value)
		hm.put(null, 123);
		hm.put(null, 80);
		hm.put("Safari", null);
		hm.put("Opera", null);
		hm.put(null, null);
		//hm.put("IE", " "); String is dt in value and if we provide value as  " " -> output is null
		hm.put(" ", 60);
		hm.put("Chrome",80);

		System.out.println(hm.get("Chrome")); // 101
		System.out.println(hm.get("chrome")); // null
		System.out.println(hm.get(null));
		System.out.println(hm.get("Safari"));
		System.out.println(hm.get("Opera"));
		System.out.println(hm.get(null));
		System.out.println(hm.get(" "));
		
       System.out.println(hm);
	}

}
