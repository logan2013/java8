package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.Joining.namesToString;
import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
Return people names separated by comma
 */
public class JoiningSpec {

	@Test
	public void toStringShouldReturnPeopleNamesSeparatedByComma() {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		List<Person> collection = asList(sara, viktor, eva);
		Assert.assertEquals(namesToString(collection), "Names: Sara, Viktor, Eva.");
	}

}
