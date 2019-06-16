package com.java2s.example.lambda;

public class Main13 {

	public static void main(String[] argv) {
		Calculator13 iCal = (x, y) -> x + y;
		System.out.println(iCal.calculate(1, 2));

		engine((x, y) -> x / y);

		System.out.println(create().calculate(2, 2));
	  }

	  private static Calculator13 create(){
	    return (x, y)-> x / y;
	  }  

	private static void engine(Calculator13 calculator) {
		int x = 4, y = 2;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}
}

@FunctionalInterface
interface Calculator13 {
	int calculate(int x, int y);
}
