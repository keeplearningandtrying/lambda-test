package com.java2s.example.function;

import java.util.function.Supplier;

public class Main13 {

	public static void main(String[] args) {
		System.out.println(maker(Employee::new));
	}

	private static Employee maker(Supplier<Employee> fx) {
		return fx.get();
	}
}

class Employee {
	@Override
	public String toString() {
		return "A EMPLOYEE";
	}
}
