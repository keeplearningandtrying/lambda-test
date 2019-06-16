package com.java2s.example.lambda;

public class Main9 {

	public static void main(String[] argv) {
		engine((x, y) -> x + y);
		engine((x, y) -> x * y);
		engine((x, y) -> x / y);
		engine((x, y) -> x % y);
	}

	private static void engine(Calculator9 calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}
}

@FunctionalInterface
interface Calculator9 {
	int calculate(int x, int y);
}
