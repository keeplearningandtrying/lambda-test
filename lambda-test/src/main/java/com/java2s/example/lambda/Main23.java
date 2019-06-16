package com.java2s.example.lambda;

import java.util.function.Function;

public class Main23 {
	
	static String x = "Hello"; 
	
	public static void main(String[] argv) {
	    final String x1 = "Hello"; 
	    Function<String,String> func1 = y -> {return y + " "+ x1 ;};
	    System.out.println(func1.apply("java2s.com"));
	    
	    
	    String z = "Hello"; 
	    Function<String,String> func2 = y -> {return y + " "+ x ;};
	    System.out.println(func2.apply("java2s.com"));

	    
	    String x2 = "Hello"; 
	    Function<String,String> func3 = y -> {/*x="a";*/ return y + " "+ x2 ;};
	    System.out.println(func3.apply("java2s.com"));

	    
	    Function<String,String> func4 = y -> {x="a"; return y + " "+ x ;};
	    System.out.println(func4.apply("java2s.com"));

	  }

}
