package com.imtzp.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.imtzp.java8.User;

public class MapTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu");

		names.stream().filter(t -> {
			
			System.out.println("filter " + t);
			
			return t.length() > 4;
		}).map(name -> {
			
			System.out.println("map " + name);
			
			User user = new User(name);

			return user;
		}).collect(Collectors.toList());
	}
}
