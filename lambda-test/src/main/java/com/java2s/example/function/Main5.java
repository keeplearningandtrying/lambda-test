package com.java2s.example.function;

import java.util.function.BooleanSupplier;

public class Main5 {
	
	public static void main(String[] args) {
	    BooleanSupplier bs = () -> true;
	    System.out.println(bs.getAsBoolean());

	    int x = 0, y= 1;
	    bs = () -> x > y;
	    System.out.println(bs.getAsBoolean());
	  }

}
