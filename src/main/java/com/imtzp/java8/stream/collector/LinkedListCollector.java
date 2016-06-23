package com.imtzp.java8.stream.collector;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * 
 * 
 * Every collector accepts items of type T and produces aggregated (accumulated)
 * value of type R (e.g. R = List<T>). Generic type A simply defines the type of
 * intermediate mutable data structure that we are going to use to accumulate
 * items of type T in the meantime.
 * 
 * 
 * supplier() returns a function that creates an instance of accumulator –
 * mutable data structure that we will use to accumulate input elements of type
 * T.
 * 
 * accumulator() returns a function that will take accumulator and one item of
 * type T, mutating accumulator.
 * 
 * combiner() is used to join two accumulators together into one. It is used
 * when collector is executed in parallel, splitting input Stream<T> and
 * collecting parts independently first.
 * 
 * finisher() takes an accumulator A and turns it into a result value, e.g.
 * collection, of type R. All of this sounds quite abstract, so let’s do a
 * simple example.
 * 
 * @author Logan
 *
 */
public class LinkedListCollector<T> implements Collector<T, LinkedList<T>, LinkedList<T>> {

	@Override
	public Supplier<LinkedList<T>> supplier() {
		return () -> new LinkedList<T>();
	}

	@Override
	public BiConsumer<LinkedList<T>, T> accumulator() {
		return (acc, t) -> acc.add(t);
	}

	@Override
	public BinaryOperator<LinkedList<T>> combiner() {
		return (left, right) -> {
			left.addAll(right);
			return left;
		};
	}

	@Override
	public Function<LinkedList<T>, LinkedList<T>> finisher() {
		return acc -> acc;
	}

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		return EnumSet.of(Characteristics.IDENTITY_FINISH);
	}

}
