package com.java2s.example.function;

import java.util.function.Function;

public class Main7 {

	public static void main(String[] args) {
		Function<Integer, String> converter = (i) -> Integer.toString(i);
		System.out.println(converter.apply(3).length());
		System.out.println(converter.apply(30).length());
		
		
		String result = calc((a) -> "Result: " + (a * 2), 10);
		System.out.println(result);

	}

	public static String calc(Function<Integer, String> bi, Integer i) {
		return bi.apply(i);
	}
}
