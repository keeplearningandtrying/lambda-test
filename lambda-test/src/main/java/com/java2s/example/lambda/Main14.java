package com.java2s.example.lambda;

public class Main14 {

	public static void main(String[] argv) {
		engine((IntCalculator14) ((x, y) -> x + y));
	}

	private static void engine(IntCalculator14 calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}

	private static void engine(LongCalculator14 calculator) {
		long x = 2, y = 4;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}
}

@FunctionalInterface
interface IntCalculator14 {
	int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator14 {
	long calculate(long x, long y);
}
