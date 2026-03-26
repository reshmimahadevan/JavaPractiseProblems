package javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streams_NameFiltering {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();

		name.add("Re");
		name.add("Sudha");
		name.add("Mahadevan");
		name.add("Ragni");

		List<String> names = Arrays.asList("Re", "Sudha", "Mahadevan", "Ragni");

		System.out.println("Sorted names that start with R using List :");

		names.stream().filter(s -> s.startsWith("R")).sorted().map(s -> s.toUpperCase()).forEach(System.out::println);

		long a = name.stream().filter(s -> s.startsWith("R")).count();

		System.out.println("Using ArrayList count of name starts with R : " + a);

		long d = Stream.of("Re", "Sudha", "Mahadevan", "Ragni").filter(s -> {
			return s.startsWith("R");

		}).count();

		System.out.println("Using Streams count of name starts with R : " + d);

		name.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println("Names Length > 4 : " + s));

		long c = name.stream().filter(s -> s.length() > 4).count();

		System.out.println("Count of names Length > 4 : " + c);

		name.stream().filter(s -> s.startsWith("R")).forEach(s -> System.out.println("Name starts with R :" + s));

		name.stream().filter(s -> s.startsWith("R")).limit(1)
				.forEach(s -> System.out.println("Name that starts with R(only the 1st name as limit is 1) : " + s));

		name.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println("Name that ends with 'a' and changing the name to Upper Case : " + s));

		ArrayList<String> names1 = new ArrayList<String>();

		names1.add("Shreeshu");
		names1.add("Shashu");

		Stream<String> con = Stream.concat(names.stream(), names1.stream());

		System.out.println("Merging two ArrayList and printing names in sorted order :");

		con.sorted().forEach(System.out::println);

		Stream<String> con1 = Stream.concat(names.stream(), names1.stream());

		boolean flag = con1.anyMatch(s -> s.equalsIgnoreCase("Shreeshu"));

		System.out.println(flag);

		Assert.assertTrue(flag);

		List<String> ls = Stream.of("Re", "Sudha", "Mahadevan", "Ragni","Shreesha").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Getting the 2nd name that end with a : " +ls.get(1));

	}

}