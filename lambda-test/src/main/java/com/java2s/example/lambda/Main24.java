package com.java2s.example.lambda;

import java.util.function.Function;

public class Main24 {

	public static void main(String[] argv) {
		Function<String, String> func1 = y -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (i == 4) {
					break;
				}
			}
			return y + " from java2s.com";
		};
		System.out.println(func1.apply("hi"));

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 4) {
				Function<String, String> func2 = y -> {
					// break;
					return y + " from java2s.com";
				};
				System.out.println(func2.apply("hi"));
			}
		}

	}

}
