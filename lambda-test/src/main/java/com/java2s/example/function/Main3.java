package com.java2s.example.function;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class Main3 {

	public static void main(String[] args) {
		BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;
		System.out.println(adder.apply(3, 4));
		
		DoubleBinaryOperator d = (x,y) -> x*y;
	    System.out.println(d.applyAsDouble(0.23, 0.45));
	}

}
