package com.imtzp.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FilterTest1 {

	public static void main(String[] args) {

		List<Integer> digitals = Arrays.asList(1, 10, 20, 30, 50);

		digitals.stream().filter(d -> d > 12).forEach(System.out::println);
	}
}
