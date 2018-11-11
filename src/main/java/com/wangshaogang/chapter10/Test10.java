/**
 * 多层内部类
 *
 * @author 王少刚
 * @create 2018-10-24 21:38
 */
package com.wangshaogang.chapter10;

public class Test10 {
	public static void main(String[] args) {
		new Test10_2().new Test10_2_2().new Test10_2_2_2().new Test10_2_2_2_2();
	}
}

class Test10_2 {
	class Test10_2_2 {
		class Test10_2_2_2 {
			class Test10_2_2_2_2 {
				{
					System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
				}
			}
		}
	}
}
