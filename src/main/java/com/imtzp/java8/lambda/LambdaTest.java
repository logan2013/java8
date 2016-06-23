package com.imtzp.java8.lambda;

public class LambdaTest {

	public void aTestMethod() {
		Runnable runnable = () -> {
			System.out.println("this " + this);
			throw new RuntimeException();
		};
		System.out.println("class:  " + runnable.getClass());
		runnable.run();
	}

	public static void main(String[] args) {
		LambdaTest lambdaTest = new LambdaTest();
		lambdaTest.aTestMethod();
	}
}
