package com.java2s.example.function;

import java.util.function.Predicate;

public class Main8 {

	public static void main(String[] args) {
		Predicate<String> i = (s) -> s.length() > 5;

		System.out.println(i.test("java2s.com "));
	}

}
