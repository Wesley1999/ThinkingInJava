/**
 * finally&return
 *
 * @author 王少刚
 * @create 2018-11-09 13:51
 */
package com.wangshaogang.chapter12;

public class Test08 {
	public static void main(String[] args) {
		System.out.println(f1());
	}

	static int f1(){
		try {
			System.out.println(111111);
			System.out.println("return");
			return f2();
		} finally {
			System.out.println(222222);
			System.out.println("return");
			return f3();
		}
	}

	static int f2() {
		System.out.println("f2()");
		return 1;
	}

	static int f3() {
		System.out.println("f3()");
		return 2;
	}
}

