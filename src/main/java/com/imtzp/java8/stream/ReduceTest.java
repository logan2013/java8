package com.imtzp.java8.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.imtzp.java8.User;

public class ReduceTest {

	public static void main(String[] args) {

		User u1 = new User();
		u1.setBalance(BigDecimal.valueOf(100));

		User u2 = new User();
		u2.setBalance(BigDecimal.valueOf(200));

		User u3 = new User();
		u3.setBalance(BigDecimal.valueOf(300));

		List<User> users = Arrays.asList(u1, u2, u3);

		//BigDecimal sumBalance = users.stream().map(User::getBalance).skip(1).reduce((b1, b2) -> b2.add(b2)).get();
		long count = users.stream().map(User::getBalance).skip(1).count();

		System.out.println(count);
	}
}
