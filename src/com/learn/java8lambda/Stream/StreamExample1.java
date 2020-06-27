package com.learn.java8lambda.Stream;

import java.util.Arrays;
import java.util.List;

import com.learn.java8lambda.Person;

public class StreamExample1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
					new Person("Charles","Dickens",60),
					new Person("Lewis","Carrol",42),
					new Person("Thomos","Carleys",53),
					new Person("Charlatte","Bronte",45),
					new Person("Methew","Arnold",39)
				);
		
//		people.stream()
//		.filter(p->p.getLastname().startsWith(("C")))
//		.forEach(p-> System.out.println(p.getFirstName()));
//
//		long count=people.stream()
//		.filter(p->p.getLastname().startsWith(("D")))
//		.count();
//		System.out.println(count);
		
		people.parallelStream()
		.filter(p->p.getLastname().startsWith(("C")))
		.forEach(p-> System.out.println(p.getFirstName()));
	}

}
