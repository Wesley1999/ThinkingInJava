/**
 * instanceof关键字和Class.isInstance()方法
 *
 * @author 王少刚
 * @create 2018-11-11 19:26
 */
package com.wangshaogang.chapter14;

public class Test05 {
	public static void main(String[] args) {
		Test05_2 test05_2 = new Test05_2_2();
		Test05_2 test05_3 = new Test05_2_3();
		if (test05_2 instanceof Test05_2_2) {
			((Test05_2_2) test05_2).f();
		}
		if (test05_3 instanceof Test05_2_2) {
			((Test05_2_2) test05_3).f();
		}
		System.out.println("---------------------------------");

		if (test05_2.getClass().isInstance(new Test05_2_2())) {
			((Test05_2_2) test05_2).f();
		}
		if (test05_3.getClass().isInstance(new Test05_2_2())) {
			((Test05_2_2) test05_3).f();
		}
		System.out.println("---------------------------------");

	}
}

class Test05_2 {
	void f() {
		System.out.println(111111);
	}
}

class Test05_2_2 extends Test05_2 {
	void f() {
		System.out.println(222222);
	}
}

class Test05_2_3 extends Test05_2 {
	void f() {
		System.out.println(333333);
	}
}