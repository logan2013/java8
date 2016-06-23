package com.imtzp.java8.lambda;

import java.lang.reflect.Method;

public class LambdaTest2 {

	public void aTestMethod() {
		Runnable runnable = () -> {
		};
		runnable.run();
	}

	public static void main(String[] args) {
		for (Method method : LambdaTest.class.getDeclaredMethods()) {
			System.out.println(method);
		}
	}
}
