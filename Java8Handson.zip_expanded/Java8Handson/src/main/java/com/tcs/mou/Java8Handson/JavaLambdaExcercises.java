package com.tcs.mou.Java8Handson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class JavaLambdaExcercises {
	
	
	private static List<String> foodList;
	public String getFoodMenu() {
		 return "";
	}
	
	
	public static void orderFoods(Supplier supp) {
		
		// check menu
		List<String> foodList=(List<String>) supp.get();
		
		// remove unhealty
		
		foodList.removeIf(f->f.equalsIgnoreCase("Biriyani")) ;
		System.out.println(foodList);
		
		// place order
		
		//Function f= return foodList.get(0);
		
		placeOrder(()-> foodList.get(0));
		
		//System.out.println("in Fooo  "+foo.foo());
		
	}
	
	
	private static void placeOrder(Foo foo) {
		String str=foo.foo();
		System.out.println(str);
	}
		
	
	
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
		
		orderFoods(()->  foodList);
		
		printAllSorted(personList);
		
		forEachExample();
		forEachListExample();
			
	}
	
	
	private static void printAllSorted(List<Person> personList) {
		
		
		Collections.sort(personList ,(o1,o2)-> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()));
		
		//personList.forEach(person-> System.out.println(person.getFirstName()));
		
		personList.forEach(p -> { if (p.getFirstName().startsWith("C")) {
			
			//System.out.println(p.getFirstName());
		
		};});		
	}
	
	
	private static void forEachExample() {
		
		Map map=new HashMap();
		map.put("1", "Sara");
		map.put("2", "Henna");
		map.putIfAbsent("1", "Sara");
		map.put("3", "Sara");
		map.put("4", "Maya");
		
		Consumer<String> cons= (s)-> System.out.println(map.get(s)+ "_ok");
		
		
		map.keySet().forEach(cons);
		
	}
	
	
	private static void forEachListExample() {
		List<String> list=new ArrayList<String>() ;
		
		list.add("bus");
		list.add("truck");
		list.add("benz");
		list.add("ferari");
		list.add("scooter");
		list.add("limogin");
		
		
		list.forEach((s)->System.out.println(s.length()));
		
		
	}
	
	
	
	
	
	
	
	


}



   interface Foo {
	public String foo();
}
