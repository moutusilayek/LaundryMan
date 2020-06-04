package com.tcs.mou.Java8Handson;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeExcercises {
	
	
	private static void getLocalDate() {
		LocalDate localDate=LocalDate.now();
		LocalDateTime newDate=	localDate.atTime(14, 30).plusHours(12);
		System.out.println(newDate);
		System.out.println(localDate);
		System.out.println(localDate.isLeapYear());
	}
	
	private static void getLocalTime() {
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
	}
	
	private static void getZonedDateTime() {
		ZonedDateTime localTime=ZonedDateTime.now();
		System.out.println(localTime);
	}
	
	
	private static void duration() {
		Duration localTime=Duration.ofHours(11).minusHours(2).between(Instant.now(), Instant.now().minusSeconds(30));
		System.out.println(Instant.now());
	}
	
	private static void showClock() {

		Clock anotherClock = Clock.system(ZoneId.of("Asia/Calcutta"));
		System.out.println(anotherClock.instant());                       //SystemClock[Europe/Tiraspol]
	}
	
	
	
	public static void main(String args[]) {
		//getLocalDate();
		//getLocalTime();
		//getZonedDateTime();
		//duration();
		showClock();
	}
	
	
	

}
