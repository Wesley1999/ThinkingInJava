/**
 * 有参匿名内部类
 *
 * @author 王少刚
 * @create 2018-10-23 17:11
 */
package com.wangshaogang.chapter10;

public class Test07 {
	public static void main(String[] args) {
		Test07_2 test07_2 = new Test07_2(2);
		Test07_2 anonymousInnerClass = test07_2.getAnonymousInnerClass(2);
		System.out.println(test07_2.getI());
		System.out.println(anonymousInnerClass.getI());
	}
}

class Test07_2 {
	private int i;
	Test07_2(int i) {
		this.i = i;
	}
	int getI() {
		return i;
	}
	Test07_2 getAnonymousInnerClass(int i) {
		return new Test07_2(i*2) {

		};
	}
}
