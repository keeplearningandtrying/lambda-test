/*
 * This software released freely into the public domain.  Anyone may copy,
 * modify, publish, use, compile, sell, or distribute this software, either
 * in source code form or as a compiled binary, for any purpose, commercial
 * or non-commercial, and by any means.  The software is provided "as is",
 * without warranty of any kind, express or implied.
 */

package test;

import com.softmoore.math.Bisection;

public class TestBisection2 {

	public static void main(String[] args) {
		double solution = Bisection.solve(x -> x * x * x + 4.0 * x * x - 10.0, 1.0, 2.0, 30, 0.0001);
		System.out.println("Using Bisection: Solution of f(x) =  0 is " + solution);
	}

}
