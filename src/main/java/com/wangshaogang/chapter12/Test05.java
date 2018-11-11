/**
 * 栈轨迹
 *
 * @author 王少刚
 * @create 2018-11-09 11:46
 */
package com.wangshaogang.chapter12;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("---------------------------------");
		f();
		System.out.println("---------------------------------");
		g();
		System.out.println("---------------------------------");
		h();
		System.out.println("---------------------------------");

	}

	static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
		}
	}
	static void g() {
		f();
	}
	static void h() {
		g();
	}
}
