package com.imtzp.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ToUpperCase {

	private ToUpperCase() {
	}

	public static List<String> transform7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String element : collection) {
			newCollection.add(element.toUpperCase());
		}
		return newCollection;
	}

	public static List<String> transform(List<String> collection) {
		return null;
	}

}
