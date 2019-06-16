package com.java2s.example.lambda;

import java.util.function.BiFunction;

public class Main18 {

	public static void main(String[] argv) {
		new Util18();
	}
}

class Util18 extends ParentUtil {

	public Util18() {
		BiFunction<String, String, String> strFunc = this::append;
		String name = "java2s.com";
		String s = strFunc.apply(name, " hi");
		System.out.println(s);

		strFunc = Util18.super::append;
		name = "java2s.com";
		s = strFunc.apply(name, " Java Lambda Tutorial");
		System.out.println(s);

	}

	@Override
	public String append(String s1, String s2) {
		System.out.println("child append");
		return s1 + s2;
	}
}

class ParentUtil {
	public String append(String s1, String s2) {
		System.out.println("parent append");
		return s1 + s2;
	}
}
