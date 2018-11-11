/**
 * 返回外部类
 *
 * @author 王少刚
 * @create 2018-10-23 16:19
 */
package com.wangshaogang.chapter10;

public class Test02 {
	private int i = 1;
	class Test02_2 {
		Test02 getTest02() {
			i = 2;
			return Test02.this;
		}
	}

	public static void main(String[] args) {
		Test02 test02 = new Test02();
		System.out.println(test02.i);
		Test02 test02_2 = test02.new Test02_2().getTest02();
		System.out.println(test02_2.i);
	}
}
