package com.example.lambda2;

import java.util.List;

public class RoboCallTest03 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();
		RoboContactAnon robo = new RoboContactAnon();

		System.out.println("\n==== Test 03 ====");
		System.out.println("\n=== Calling all Drivers ===");
		
		MyTest<Person> t1 = p -> p.getAge() >= 16;
		
		/*
		robo.phoneContacts(pl, new MyTest<Person>() {
			@Override
			public boolean test(Person p) {
				return p.getAge() >= 16;
			}
		});
		*/

		robo.phoneContacts(pl, t1);

		System.out.println("\n=== Emailing all Draftees ===");
		robo.emailContacts(pl, new MyTest<Person>() {
			@Override
			public boolean test(Person p) {
				return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
			}
		});

		System.out.println("\n=== Mail all Pilots ===");
		robo.mailContacts(pl, new MyTest<Person>() {
			@Override
			public boolean test(Person p) {
				return p.getAge() >= 23 && p.getAge() <= 65;
			}
		});

	}
}
