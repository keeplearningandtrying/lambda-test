package com.java2s.example.lambda;

public class Main1 {

	public static void main(String[] args) {
		MyIntegerCalculator1 myIntegerCalculator = (Integer s1) -> s1 * 2;
		System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));
	}
}

interface MyIntegerCalculator1 {
	public Integer calcIt(Integer s1);
}
