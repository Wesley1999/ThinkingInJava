/**
 * 重新抛出异常
 *
 * @author 王少刚
 * @create 2018-11-09 12:01
 */
package com.wangshaogang.chapter12;

public class Test06 {
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			h();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}

	}

	static void f() throws Exception {
		throw new Exception();
	}

	static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			throw e;
		}
	}

	static void h() throws Throwable {
		try {
			f();
		} catch (Exception e) {
			throw e.fillInStackTrace();
		}
	}
}
