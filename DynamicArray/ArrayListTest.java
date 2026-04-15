package DynamicArray;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// List(I) ----> ArrayList(C)
		// ArrayList maintains Index/Order
		//Refer OneDrive - ArrayList

		// vc = Virtual Capacity/pc = Physical Capacity
		ArrayList ar = new ArrayList();// vc=0/pc=0
		System.out.println(ar.size());

		ar.add(100); // 0
		ar.add(200); // 1

		System.out.println(ar.size()); // To print the length  //vc=8/pc=2

		ar.add(300); // 0
		ar.add(400);

		System.out.println(ar.size());//vc=6/pc=4
	}

}
