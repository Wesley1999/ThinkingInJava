/**
 * Class类
 *
 * @author 王少刚
 * @create 2018-11-11 14:36
 */
package com.wangshaogang.chapter14;

public class Test02 {
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("com.wangshaogang.chapter14.Test02_2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Class name: " + c.getName());
		System.out.println("Simple name: " + c.getSimpleName());
		System.out.println("Canonical name: " + c.getCanonicalName());

		System.out.println("---------------------------------");
		Class c2 = new Test02().getClass();
		// 这个类已经加载了
		System.out.println(c2.getName());
	}
}

class Test02_2 {
	static {
		System.out.println("Test02_2");
	}
}

class Test02_3 {
	static {
		System.out.println("Test02_3");

	}
}