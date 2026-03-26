package javaprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordandNumberLimit_Regex {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("JavaProgrammingBook");
		names.add("12345678");
		names.add("Reshmi");
		names.add("1");

//The regular expression ^((\\d{8})|(\\w{6}))$ is looking for strings that either consist of exactly eight digits or exactly six word characters
//The ^ and $ anchors ensure that the entire string must match the specified patterns without any additional characters before or after. The | allows for either of the specified patterns to match.
		String regex = "^((\\d{8})|(\\w{6}))$";

		Pattern pattern = Pattern.compile(regex);

		for (String name : names) {
			Matcher matcher = pattern.matcher(name);
			if (matcher.matches()) {
				System.out.println(name);
			}
			
			else
			{
				System.out.println("Invalid Input");
			}

		}

	}
}