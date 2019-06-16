package com.java2s.example.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main10 {

	public static void main(String[] args) {
		List<Student10> employees = Arrays.asList(new Student10(1, 3, "John"), new Student10(2, 3, "Jane"),
				new Student10(3, 4, "Jack"));

		// with predicate
		System.out.println(findStudents(employees, createCustomPredicateWith(10_000)));

		// with function definition, both are same
		Function<Double, Predicate<Student10>> customFunction = threshold -> (e -> e.gpa > threshold);
		System.out.println(findStudents(employees, customFunction.apply(10_000D)));
	}

	private static Predicate<Student10> createCustomPredicateWith(double threshold) {
		return e -> e.gpa > threshold;
	}

	private static List<Student10> findStudents(List<Student10> employees, Predicate<Student10> condition) {
		List<Student10> result = new ArrayList<>();

		for (Student10 e : employees) {
			if (condition.test(e)) {
				result.add(e);
			}
		}

		return result;
	}

}

class Student10 {
	public int id;
	public long gpa;
	public String name;

	Student10(int id, long g, String name) {
		this.id = id;
		this.gpa = g;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ">" + name + ": " + gpa;
	}
}
