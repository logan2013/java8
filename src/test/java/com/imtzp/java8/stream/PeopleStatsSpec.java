package com.imtzp.java8.stream;

import static com.imtzp.java8.stream.PeopleStats.getStats;
import static java.util.Arrays.asList;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/*
Get people statistics: average age, count, maximum age, minimum age and sum og all ages.
 */
public class PeopleStatsSpec {

	Person sara = new Person("Sara", 4);
	Person viktor = new Person("Viktor", 40);
	Person eva = new Person("Eva", 42);
	List<Person> collection = asList(sara, eva, viktor);

	@Test
	public void getStatsShouldReturnAverageAge() {
		Assert.assertThat(getStats(collection).getAverage(), CoreMatchers.equalTo((double) (4 + 40 + 42) / 3));
	}

	@Test
	public void getStatsShouldReturnNumberOfPeople() {
		Assert.assertThat(getStats(collection).getCount(), CoreMatchers.equalTo(3L));
	}

	@Test
	public void getStatsShouldReturnMaximumAge() {
		Assert.assertThat(getStats(collection).getMax(), CoreMatchers.equalTo(42));
	}

	@Test
	public void getStatsShouldReturnMinimumAge() {
		Assert.assertThat(getStats(collection).getMin(), CoreMatchers.equalTo(4));
	}

	@Test
	public void getStatsShouldReturnSumOfAllAges() {
		Assert.assertThat(getStats(collection).getSum(), CoreMatchers.equalTo((long) (40 + 42 + 4)));
	}

}
