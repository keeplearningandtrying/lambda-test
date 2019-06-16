package com.java2s.example.lambda;

public class Main12 {

	public static void main(String[] argv) {
		IntCalculator12 iCal = (x, y) -> x + y;
		engine(iCal);
		engine((long x, long y) -> x * y);
		engine((int x, int y) -> x / y);
		engine((long x, long y) -> x % y);
	}

	private static void engine(IntCalculator12 calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}

	private static void engine(LongCalculator12 calculator) {
		long x = 2, y = 4;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}
}

@FunctionalInterface
interface IntCalculator12 {
	int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator12 {
	long calculate(long x, long y);
}
