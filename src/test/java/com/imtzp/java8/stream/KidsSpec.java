package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.Kids.getKidNames;
import static java.util.Arrays.asList;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/*
Get names of all kids (under age of 18)
 */
public class KidsSpec {

	@Test
	public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		Person anna = new Person("Anna", 5);
		List<Person> collection = asList(sara, eva, viktor, anna);
		Assert.assertThat(getKidNames(collection), CoreMatchers.hasItems("Sara", "Anna"));
	}

}
