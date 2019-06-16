/*
 * This software released freely into the public domain.  Anyone may copy,
 * modify, publish, use, compile, sell, or distribute this software, either
 * in source code form or as a compiled binary, for any purpose, commercial
 * or non-commercial, and by any means.  The software is provided "as is",
 * without warranty of any kind, express or implied.
 */

package test;

import com.softmoore.math.DoubleFunction;
import com.softmoore.math.Simpson;

public class TestSimpson2 {
	public static void main(String[] args) {
		DoubleFunction sineAdapter = new DoubleFunction() {
			public double f(double x) {
				return Math.sin(x);
			}
		};

		double result = Simpson.integrate(sineAdapter, 0, Math.PI, 30);
		System.out.println("Using Simpson: Integral of sine from 0 to pi is " + result);
	}
}
