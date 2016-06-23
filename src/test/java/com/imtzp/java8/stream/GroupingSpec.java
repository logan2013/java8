package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.Grouping.groupByNationality;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
Group people by nationality
 */
public class GroupingSpec {

	@Test
	public void partitionAdultsShouldSeparateKidsFromAdults() {
		Person sara = new Person("Sara", 4, "Norwegian");
		Person viktor = new Person("Viktor", 40, "Serbian");
		Person eva = new Person("Eva", 42, "Norwegian");
		List<Person> collection = asList(sara, eva, viktor);
		Map<String, List<Person>> result = groupByNationality(collection);

		Assert.assertEquals(result.get("Norwegian"), asList(sara, eva));

		Assert.assertEquals(result.get("Serbian"), asList(viktor));
	}

}
