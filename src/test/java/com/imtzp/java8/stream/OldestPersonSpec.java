package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.OldestPerson.getOldestPerson;
import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
Get oldest person from the collection
 */
public class OldestPersonSpec {

	@Test
	public void getOldestPersonShouldReturnOldestPerson() {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		List<Person> collection = asList(sara, eva, viktor);
		Assert.assertSame(getOldestPerson(collection), eva);
	}

}
