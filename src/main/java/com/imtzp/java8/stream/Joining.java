package com.imtzp.java8.stream;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Joining {

	private Joining() {
	}

	public static String namesToString7(List<Person> people) {
		String label = "Names: ";
		StringBuilder sb = new StringBuilder(label);
		for (Person person : people) {
			if (sb.length() > label.length()) {
				sb.append(", ");
			}
			sb.append(person.getName());
		}
		sb.append(".");
		return sb.toString();
	}

	public static String namesToString(List<Person> people) {
		
		StringJoiner j = new StringJoiner("");
		j.add("hello");
		
		j.toString();
		
		return people.stream().map(Person::getName).collect(Collectors.joining(",", "Names: ", "."));
	}
}
