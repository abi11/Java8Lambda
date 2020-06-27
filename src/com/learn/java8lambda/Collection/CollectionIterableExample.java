package com.learn.java8lambda.Collection;

import java.util.Arrays;
import java.util.List;

import com.learn.java8lambda.Person;

public class CollectionIterableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carrol",42),
				new Person("Thomos","Carleys",53),
				new Person("Charlatte","Bronte",45),
				new Person("Methew","Arnold",39)
			);
		for(int i=0; i< people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		for (Person p : people) {
			System.out.println(p);
		}
		
		
		people.forEach(p->System.out.println(p));
		people.forEach(System.out::println);
	}

}
