package com.learn.java8lambda.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learn.java8lambda.Person;

public class MethodReferenceExample2 {

	public static void main(String []args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
			new Person("Charles","Dickens",60),
			new Person("Lewis","Carrol",42),
			new Person("Thomos","Carleys",53),
			new Person("Charlatte","Bronte",45),
			new Person("Methew","Arnold",39)
		);

// replace with		printConditional(people,p->true,p-> System.out.println(p));
		printConditional(people,p->true,System.out::println);// p->method(p)
	//	Step 3: print all people last name ending with C	
//		printConditional(people, p->p.getLastname().startsWith("C"));
//		
//		printConditional(people, p->p.getFirstName().startsWith("C"));
	}
	
	


	private static void printConditional(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		for(Person p: people) {
			if(predicate.test(p)) {
			consumer.accept(p);
			}
		}
	}
}
