package com.exception;

public class MethodChaining {
	void m1() {
		m2();

	}

	void m2() {
		m3();
	}

	void m3() {
		m4();
	}

	void m4() {
		try {
			int a = 6, b = 0, res;
			// System.exit(0);
			res = a / b;

			System.out.println(res);
			// return res;

		}
		// can't write anything b/w try n catch
		catch (ArithmeticException a) {
			System.out.println("catch block");
		}
		// can't write anything b/w catch n finally
		// int a=7;

		finally {
			System.out.println("finally block");

		}
	}

	public static void main(String[] args) {
		MethodChaining m = new MethodChaining();
		m.m1();
	}
}
