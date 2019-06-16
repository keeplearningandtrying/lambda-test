package com.java2s.example.lambda;

public class Main15 {

	public static void main(String[] argv) {
		NonFunction15 nonFunction = (NonFunction15 & Calculator15) (x, y) -> x + y;
		
		java.io.Serializable ser = (java.io.Serializable & Calculator15) (x,y)-> x + y;
		
	}
}

@FunctionalInterface
interface Calculator15 {
	long calculate(long x, long y);
}

interface NonFunction15 {
}
