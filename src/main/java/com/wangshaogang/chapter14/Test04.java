/**
 * 泛化Class的引用
 *
 * @author 王少刚
 * @create 2018-11-11 15:40
 */
package com.wangshaogang.chapter14;

public class Test04 {
	public static void main(String[] args) {
		Class<? extends Number> c = int.class;
		System.out.println(c.getName());
	}
}
