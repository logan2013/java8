package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.Partitioning.partitionAdults;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
Partition adults and kids
 */
public class PartitioningSpec {

	@Test
	public void partitionAdultsShouldSeparateKidsFromAdults() {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		List<Person> collection = asList(sara, eva, viktor);
		Map<Boolean, List<Person>> result = partitionAdults(collection);
		Assert.assertEquals(result.get(true), asList(eva, viktor));
		Assert.assertEquals(result.get(false), asList(sara));
	}

}
