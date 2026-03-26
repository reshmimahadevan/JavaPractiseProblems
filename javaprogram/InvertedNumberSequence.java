package javaprogram;

public class InvertedNumberSequence {

	public static void main(String[] args) {

//		int k = 1;
//		for (int i = 0; i <= 3; i++) {
//			for (int j = 1; j <= i + 1; j++) {
//				System.out.print(k);
//				System.out.print(" ");
//				k++;
//			}
//
//			System.out.println(" ");
			
//			for (int i = 0; i <= 3; i++) {
//				for (int j = 1; j <= i + 1; j++) {
//					System.out.print(j);
//					System.out.print(" ");
//					
//				}
//
//				System.out.println(" ");
//		}

		int k=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(k*3);
				System.out.print(" ");
				k++;
			}
			
			System.out.println(" ");
		}
	}

}
