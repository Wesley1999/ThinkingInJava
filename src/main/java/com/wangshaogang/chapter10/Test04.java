/**
 * 方法中的内部类
 *
 * @author 王少刚
 * @create 2018-10-23 16:33
 */
package com.wangshaogang.chapter10;

public class Test04 {

	public static void main(String[] args) {
		Test04 test04 = new Test04();
		test04.f1();
	}

	void f1() {
		class F1_Inner1 {
			private int i = 1;
			void printStar() {
				System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
			}
		}
		F1_Inner1 f1_inner1 = new F1_Inner1();
		f1_inner1.printStar();
		System.out.println(f1_inner1.i);
	}
}
