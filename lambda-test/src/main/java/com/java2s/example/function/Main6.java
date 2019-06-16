package com.java2s.example.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class Main6 {

	public static void main(String[] args) {
		Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		c.accept("Java2s.com");

		int x = 99;
		Consumer<Integer> myConsumer = (y) -> {
			System.out.println("x = " + x); // Statement A
			System.out.println("y = " + y);
		};
		myConsumer.accept(x);

		List<Student> students = Arrays.asList(new Student("John", 3), new Student("Mark", 4));
		acceptAllEmployee(students, e -> System.out.println(e.name));
		acceptAllEmployee(students, e -> {
			e.gpa *= 1.5;
		});
		acceptAllEmployee(students, e -> System.out.println(e.name + ": " + e.gpa));


		DoubleConsumer d = (p) -> System.out.println(p * p);
		d.accept(0.23);
	}

	public static void acceptAllEmployee(List<Student> student, Consumer<Student> printer) {
		for (Student e : student) {
			printer.accept(e);
		}
	}

}

class Student {
	public String name;
	public double gpa;

	Student(String name, double g) {
		this.name = name;
		this.gpa = g;
	}
}
