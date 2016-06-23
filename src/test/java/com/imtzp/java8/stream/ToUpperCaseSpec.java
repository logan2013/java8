package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.ToUpperCase.transform;
import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
Convert elements of a collection to upper case.
 */
public class ToUpperCaseSpec {

	@Test
	public void transformShouldConvertCollectionElementsToUpperCase() {
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
		Assert.assertEquals(transform(collection), expected);
	}

}
