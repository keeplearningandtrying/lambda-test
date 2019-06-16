package com.java2s.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main20 {
	public static void main(String[] argv) {
		Function<String[], List<String>> asList = Arrays::<String>asList;
		System.out.println(asList.apply(new String[] { "a", "b", "c" }));
		
		
	}
}
