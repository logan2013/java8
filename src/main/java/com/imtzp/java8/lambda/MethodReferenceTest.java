package com.imtzp.java8.lambda;

import java.util.stream.Stream;

import com.imtzp.java8.User;

public class MethodReferenceTest {

	public static void main(String[] args) {
		
		User user = new User();
	
		Stream.of(user).filter(User::isRealUser);
		
		Stream.of(user).filter(u -> {
			return User.isRealUser(u);
		});
	}
}
