package javaprogram;

public class SmallestNumberInMultiDimentionalArray {

	public static void main(String[] args) {

		int a[][] = { { 2, 4, 0 }, { 3, 4, 7 }, { 1, 2, 9 } };

		int min = a[0][0];
		
		int mincoloumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				    mincoloumn =j;
									
				}
			}

		}
		
		int max = a[0][mincoloumn];
		
		int k = 0;
		
		while(k<3)
		{
			if(a[k][mincoloumn]>max)
			{
				max = a[k][mincoloumn];
			
			}
			
			k++;
		}
		
          System.out.println(max);
		//System.out.println(min);

	}

}
