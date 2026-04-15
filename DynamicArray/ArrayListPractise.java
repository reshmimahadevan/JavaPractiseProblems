package DynamicArray;

import java.util.ArrayList;

public class ArrayListPractise {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(); // vc=10/pc=0

		System.out.println(ar.size()); // 0

		ar.add(100);// 1
		ar.add(200);// 2
		ar.add(300);// 3
		ar.add(400);// 4
		ar.add(500);// 5

		System.out.println(ar.size());// 4

		//VC and PC gets removed
		ar.remove(2);
		ar.remove(3);

		System.out.println(ar.size());// 2

		System.out.println(ar.get(1));

		ar.remove(1);

		System.out.println(ar.get(1));

		// Print all the values in ArrayList
		System.out.println(ar);

		// System.out.println(ar.get(4)); //IndexOut Of Bound Exception

		// Using For Loop
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// ArrayList is a raw datatype
		ArrayList ls = new ArrayList();
		ls.add(100);
		ls.add(12.33);
		ls.add("testing");
		ls.add(true);
		ls.add('a');
		System.out.println(ls);

		// ArrayList with Generics
		ArrayList<Integer> ar1 = new ArrayList<Integer>();// vc=10/pc=0
		ar1.add(100);
		ar1.add(200);
		// You never called any method on the Integer elements. You only passed the list
		// to System.out.println(), which internally uses String.valueOf(e) — and that
		// safely handles null by printing the word "null" without calling any method on
		// the element itself.
		ar1.add(null);
		System.out.println(ar1);

		ArrayList<Double> ar2 = new ArrayList<Double>();
		ar2.add(12.33);
		ar2.add(200.22);
		System.out.println(ar2);

		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("chrome");
		// When e is null, calling e.equals(...) means you're invoking a method on a
		// null reference — there's no object there to call .equals() on, so Java throws
		// NullPointerException.
		//ar3.add(null);
		ar3.add("firefox");
		ar3.add("edge");
		for (String e : ar3) {
			System.out.println(e);
			if (e.equals("firefox")) {
				System.out.println("Enter URL");
				break;
			}
		}

		ArrayList<Object> ar4 = new ArrayList<Object>();
		ar4.add(100);
		ar4.add(12.33);
		ar4.add("testing");
		ar4.add(true);
		ar4.add('a');
		System.out.println(ar4);

		ArrayList<String> studentList = new ArrayList<String>();
		// Duplicate values can be added
		studentList.add(null);
		studentList.add("Nive");
		studentList.add("Reshmi");
		studentList.add("Shreesha");
		studentList.add("Thaswika");
		studentList.add("Bhavika");
		studentList.add("Nive");
		studentList.add("Reshmi");
		studentList.add("");
		studentList.add(null);
		studentList.add(null);

		System.out.println(studentList);

		ArrayList<String> footerList = new ArrayList<String>();
		// Duplicate values can be added
		footerList.add("About Us");
		footerList.add("Contact Us");
		footerList.add("Wish List");
		footerList.add("T&C");
		footerList.add("MyAccount");

		// Index Out Of Bound Exception
		// footerList.add(8,"Add to Cart");

		// Not Update/Replace Shifting happen
		// footerList.add(0,"Add to Cart");

		// Replaces
		footerList.set(0, "Add to Cart");

		for (String e : footerList) {
			System.out.println(e);
			if (e.equals("Wish List")) {
				System.out.println("Click On It");
				break;
			}
		}

	}

}
