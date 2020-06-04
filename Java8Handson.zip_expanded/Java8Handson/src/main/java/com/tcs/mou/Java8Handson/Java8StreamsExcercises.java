package com.tcs.mou.Java8Handson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamsExcercises {
	
	private static List<String> foodList;
	
	public static void main(String args[]) {
		List<Person> personList=new ArrayList<Person>();
		personList.add(new Person("Cina" , "Tusi" , 34));
		personList.add(new Person("san" , "nanadn" , 38));
		personList.add(new Person("Cail" , "mohan" , 39));
		personList.add(new Person("jack" , "roy" , 24));
		
		foodList=new ArrayList<String>();
		foodList.add("Biriyani");
		foodList.add("Pulao");
		foodList.add("friedRice");
		foodList.add("LemonRice");
		foodList.add("Curd Rice");
		foodList.add("Schezuan Rice");
		foodList.add("Bana Rice");
		
		
		//streamOfExample();
		//streamArrayOfElements();
		//listStreamExample();
		//streamOnTokens();
		//streamToList();
		//filterStream();
		//mapStream();
		sortedStream();
	}
	
	
	
	// Stream of example:
	
	private static void streamOfExample() {
		Stream<String> stream=Stream.of("1","2","3","4");
		stream.forEach((s)-> System.out.println(s));		
	}
	
	private static void streamArrayOfElements() {
		Stream stream=Stream.of(new Integer[] {1,2,4,8,16});
		stream.forEach((s)-> System.out.println(s));
			
	}
	
	
	private static void listStreamExample() {
		foodList.stream().forEach((s)-> {foodList.add(s +"new menu");
		System.out.println(s);
			
		});
		
	}
	
	private static void streamOnTokens() {
		Stream stream=Stream.of("a,b,c,d".split(","));
		//System.out.println(stream.findFirst());;
		stream.forEach((s)->System.out.println(s));
	}
	
	
	private static void streamToList() {
		List<String> stream=Stream.of("a,a,a,b,d,g,c,c,d".split(","))
				.distinct().collect(Collectors.toList());
		System.out.println(stream);
		
	}
	
	
	
	/// Intermediate operations //////////////////////////////
	
	private static void filterStream() {
		List filteredList=foodList.stream().filter((s)->s.contentEquals("Biriyani")).collect(Collectors.toList());
		System.out.println(filteredList);
	}
	
	
	private static void mapStream() {
		List<Person> filteredList=foodList.stream().map((s)->new Person(s)).collect(Collectors.toList());
		filteredList.forEach((p)->System.out.println(p.getFirstName()));
		
		//System.out.println(filteredList);
	}
	
	private static void sortedStream() {
		;
		System.out.println(foodList.stream().sorted().map((s)->s.toUpperCase()).collect(Collectors.toList()));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
