package com.java2s.example.lambda;

public class Main10 {

	public static void main(String[] argv) {
		engine((int x, int y) -> x + y);
		engine((long x, long y) -> x * y);
		engine((int x, int y) -> x / y);
		engine((long x, long y) -> x % y);
	}

	private static void engine(IntCalculator10 calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}

	private static void engine(LongCalculator10 calculator) {
		long x = 2, y = 4;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}
}

@FunctionalInterface
interface IntCalculator10 {
	int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator10 {
	long calculate(long x, long y);
}
