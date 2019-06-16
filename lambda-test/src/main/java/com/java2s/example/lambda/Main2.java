package com.java2s.example.lambda;

public class Main2 {

	public static void main(String[] args) {
		MyIntegerCalculator2 myIntegerCalculator = (s1) -> s1 * 2;
		System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));
	}
}

interface MyIntegerCalculator2 {
	public Integer calcIt(Integer s1);
}
