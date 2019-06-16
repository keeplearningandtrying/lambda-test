package com.java2s.example.lambda;

import java.util.function.IntFunction;

public class Main25 {
	public static void main(String[] args) {
		IntFunction<Long> factorialCalc = Main25::factorial;
		System.out.println(factorialCalc.apply(10));
	}

	public static long factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
