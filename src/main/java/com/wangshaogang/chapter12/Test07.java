/**
 * finally
 *
 * @author 王少刚
 * @create 2018-11-09 13:32
 */
package com.wangshaogang.chapter12;

public class Test07 {
	public static void main(String[] args) {
		try {
			f1();
		} catch (ClassCastException e) {
			System.out.println("Exception has been caught.");
		} finally {
			System.out.println("This is finally");
		}
		System.out.println("This is out of try-catch-finally");

	}

	static void f1() {
		int i = 1 / 0;
	}
}
