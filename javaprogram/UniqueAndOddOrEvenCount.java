package javaprogram;

public class UniqueAndOddOrEvenCount {

	public static void main(String[] args) {

		int numbers[] = { 1, 5, 8, 1, 2, 9 ,10 };

//		for (int i = 0; i < numbers.length; i++) {
//
//			for (int j = i + 1; j < numbers.length; j++) {
//
//				if (numbers[i] == numbers[j]) {
//
//					System.out.println(numbers[i]);
//
//				}
//
//			}

		int evencount = 0;
		int oddcount = 0;
		for (int k = 0; k < numbers.length; k++) {
			if (numbers[k] % 2 == 0) {

				evencount++;
			}
			
			else
			{
				oddcount++;
			}

		}

		System.out.println("The even numbers present in the array is "+evencount);
		System.out.println("The odd numbers present in the array is "+oddcount);
	

	}
	
	

}
