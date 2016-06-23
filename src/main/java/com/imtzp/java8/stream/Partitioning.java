package com.imtzp.java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Partitioning {

	private Partitioning() {
	}

	public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
		Map<Boolean, List<Person>> map = new HashMap<>();
		map.put(true, new ArrayList<>());
		map.put(false, new ArrayList<>());
		for (Person person : people) {
			map.get(person.getAge() >= 18).add(person);
		}
		return map;
	}

	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		return null;
	}

}
