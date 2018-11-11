/**
 * if语句和for语句中的内部类
 *
 * @author 王少刚
 * @create 2018-10-23 16:37
 */
package com.wangshaogang.chapter10;

public class Test05 {
	public static void main(String[] args) {
		if (true) {
			class If_Inner1 {
				void printStar() {
					System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ in IF");
				}
			}
			If_Inner1 if_inner1 = new If_Inner1();
			if_inner1.printStar();
		}

		for (int i=0; i<5; i++) {
			class For_Inner1 {
				void printStar(int i) {
					System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ in FOR " + i);
				}
			}
			For_Inner1 for_Inner1 = new For_Inner1();
			for_Inner1.printStar(i);
		}
	}
}
