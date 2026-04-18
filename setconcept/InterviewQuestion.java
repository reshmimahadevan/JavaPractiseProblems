package setconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		//Simple analogy: Think of a HashMap as a register book.
        //The whole book = HashMap
        //One row in the book (name + phone number) = Map.Entry
        //Reading each row while going line by line = using Iterator over entrySet()
		
        //Here's a step-by-step visual walkthrough of the program — click each step to move through it:Here's a plain-English summary of what the whole program does:
        //The program creates a `HashMap` (a hash table) and stores two key-value pairs in it — `1 → "Hi"` and `2 → "Hello"`. To read those pairs back out, it uses a three-step pattern that is very common in Java:
        //1. `entrySet()` — wraps all key-value pairs into a `Set` of `Map.Entry` objects
        //2. `iterator()` — creates a cursor that can walk through the `Set` one element at a time
        //3. `while(it.hasNext())` — loops, calling `it.next()` each time to get the next entry, then prints its key and value using `getKey()` and `getValue()`
        //The cast `(Map.Entry) it.next()` is needed because the raw `Iterator` only knows it holds `Object`s — the cast tells Java to treat each one as a `Map.Entry` so we can call those methods on it.

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Hi");
		hm.put(2, "Hello");
		Set s = hm.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry m = (Map.Entry)it.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

}
