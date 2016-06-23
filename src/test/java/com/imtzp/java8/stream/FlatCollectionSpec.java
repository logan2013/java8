package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.FlatCollection.transform;
import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
Flatten multidimensional collection
 */
public class FlatCollectionSpec {

	@Test
	public void transformShouldFlattenCollection() {
		List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
		List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
		Assert.assertEquals(transform(collection), expected);
	}

}
