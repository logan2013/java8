package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.FilterCollection.transform;
import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
Filter collection so that only elements with less then 4 characters are returned.
 */
public class FilterCollectionSpec {

	@Test
	public void transformShouldFilterCollection() {
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("My", "is", "Doe");
		Assert.assertEquals(transform(collection), expected);
	}
}
