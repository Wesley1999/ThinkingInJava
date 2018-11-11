/**
 * 接口中的域
 *
 * @author 王少刚
 * @create 2018-10-22 16:11
 */
package com.wangshaogang.chapter09;

import lombok.ToString;

public class Test07 {
	public static void main(String[] args) {
		new Test07_C2();
		System.out.println("---------------------------------");
		System.out.println(Test07_I1.test07_C1);
	}
}

@ToString
class Test07_C1 {
	Test07_C1() {
		System.out.println("Test07_C1 constructed.");
	}
}

interface Test07_I1 {
	Test07_C1 test07_C1 = new Test07_C1();
}

class Test07_C2 implements Test07_I1 {
	Test07_C2() {
		System.out.println("Test07_C2 constructed.");
	}
}
