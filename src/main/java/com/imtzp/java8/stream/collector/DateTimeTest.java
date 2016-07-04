package com.imtzp.java8.stream.collector;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();

		System.out.println(localDate);
		
		LocalTime lt = LocalTime.now();

		System.out.println(lt);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
	}
}
