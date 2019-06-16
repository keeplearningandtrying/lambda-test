
package com.java2s.example.function;

import java.util.function.Supplier;

public class Main14 {

	public static void main(String[] args) {
		Supplier<Student14> studentGenerator = Main14::employeeMaker;

		for (int i = 0; i < 10; i++) {
			System.out.println("#" + i + ": " + studentGenerator.get());
		}
	}

	public static Student14 employeeMaker() {
		return new Student14("A", 2);
	}

}

class Student14 {
	public String name;
	public double gpa;

	Student14(String name, double g) {
		this.name = name;
		this.gpa = g;
	}

	@Override
	public String toString() {
		return name + ": " + gpa;
	}
}
