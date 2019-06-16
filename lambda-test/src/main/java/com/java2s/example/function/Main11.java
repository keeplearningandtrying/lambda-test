package com.java2s.example.function;

import java.util.function.Supplier;

public class Main11 {

	public static void main(String[] args) {
		Supplier<String> i = () -> "java2s.com";
		System.out.println(i.get());
	}

}
