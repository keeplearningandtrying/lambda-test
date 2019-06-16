package com.java2s.example.function;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Main1 {

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (x, y) -> {
			System.out.println(x);
			System.out.println(y);
		};

		biConsumer.accept("java2s.com", " tutorials");

	}
}
