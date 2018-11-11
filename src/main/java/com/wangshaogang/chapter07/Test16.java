/**
 * 如果main方法所在的类继承的类有静态块，要先执行静态块。
 *
 * @author 王少刚
 * @create 2018-10-22 16:50
 */
package com.wangshaogang.chapter07;

public class Test16 {
	static {
		System.out.println("Hello Test16");
	}
}

class Test16_2 extends Test16 {
	public static void main(String[] args) {
		System.out.println("Hello Test16_2");
	}
}