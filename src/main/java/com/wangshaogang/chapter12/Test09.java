/**
 * 异常丢失
 *
 * @author 王少刚
 * @create 2018-11-09 14:24
 */
package com.wangshaogang.chapter12;

public class Test09 {
	static class E1 extends Exception {
		@Override
		public String toString() {
			return "E1";
		}
	}
	static class E2 extends Exception {
		@Override
		public String toString() {
			return "E2";
		}
	}

	static void f1() throws E1 {
		throw new E1();
	}

	static void f2() throws E2 {
		throw new E2();
	}

	public static void main(String[] args) {
		try {
			try {
				f1();
			} finally {
				f2();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}


	}

}

