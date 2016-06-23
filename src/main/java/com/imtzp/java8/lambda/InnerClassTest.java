package com.imtzp.java8.lambda;

public class InnerClassTest {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("this " + this);
			}
		};
		
		new Thread(runnable).start();
	}
}
