package javaprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_NumberSort_Ascending {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7,8,6);
		
		System.out.println("The unique numbers are : ");
	     		
		values.stream().distinct().forEach(System.out::println);

		System.out.println("The sorted stream is : ");
      
		values.stream().distinct().sorted().forEach(System.out::println);

		List<Integer> ls = values.stream().distinct().sorted().collect(Collectors.toList());

		// ::Method reference - you will be invoking the println method with a
		//  parameter, which name you don't specify explicitly
		
		System.out.println("3rd element in the sorted array is :  "+ls.get(2));
		
		System.out.println("The even numbers are : ");
		
		values.stream().distinct().sorted().filter(s->s%2 == 0).forEach(System.out::println);
		
	}
}