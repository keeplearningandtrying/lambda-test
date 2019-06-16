/*
 * This software released freely into the public domain.  Anyone may copy,
 * modify, publish, use, compile, sell, or distribute this software, either
 * in source code form or as a compiled binary, for any purpose, commercial
 * or non-commercial, and by any means.  The software is provided "as is",
 * without warranty of any kind, express or implied.
 */

package test;

import com.softmoore.math.Simpson;

public class TestSimpson5 {
	public static void main(String[] args) {
		double result = Simpson.integrate(Math::sin, 0, Math.PI, 30);
		System.out.println("Using Simpson: Integral of sine from 0 to pi is " + result);
	}
}
