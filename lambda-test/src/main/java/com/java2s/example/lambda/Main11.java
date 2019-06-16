package com.java2s.example.lambda;

public class Main11 {

	public static void main(String[] argv) {
		engine((IntCalculator11) ((x, y) -> x + y));
		engine((long x, long y) -> x * y);
		engine((int x, int y) -> x / y);
		engine((long x, long y) -> x % y);
	}

	private static void engine(IntCalculator11 calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}

	private static void engine(LongCalculator11 calculator) {
		long x = 2, y = 4;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}
}

@FunctionalInterface
interface IntCalculator11 {
	int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator11 {
	long calculate(long x, long y);
}
