package com.java2s.example.function;

import java.util.function.BiPredicate;

public class Main4 {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
		System.out.println(bi.test(2, 3));

		boolean result = compare((a, b) -> a / 2 == b, 10, 5);
		System.out.println("Compare result: " + result);
	}

	public static boolean compare(BiPredicate<Integer, Integer> bi, Integer i1, Integer i2) {
		return bi.test(i1, i2);
	}
}
