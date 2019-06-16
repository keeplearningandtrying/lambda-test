package com.java2s.example.lambda;

import java.util.function.Function;

public class Main21 {
	public Main21() {
		Function<String, String> func1 = x -> {
			System.out.println(this);
			return x;
		};
		System.out.println(func1.apply(""));
	}

	public String toString() {
		return "Main21";
	}

	public static void main(String[] argv) {
		new Main21();
	}
}
