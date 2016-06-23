package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.Sum.calculate;
import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
Sum all elements of a collection
 */
public class SumSpec {

	@Test
	public void transformShouldConvertCollectionElementsToUpperCase() {
		List<Integer> numbers = asList(1, 2, 3, 4, 5);
		Assert.assertEquals(calculate(numbers), 1 + 2 + 3 + 4 + 5);
	}

}
