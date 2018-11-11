/**
 * 内部类访问权限
 *
 * @author 王少刚
 * @create 2018-10-23 16:25
 */
package com.wangshaogang.chapter10;

public class Test03 {
	public static void main(String[] args) {
		Test03_2 test03_2 = new Test03_2();
		test03_2.new Test03_2_Inner1().printStar();
		test03_2.new Test03_2_Inner2().printStar();
		test03_2.new Test03_2_Inner3().printStar();
		// private的不能访问
//		test03_2.new Test03_2_Inner4().printStar();
	}

}

class Test03_2 {
	public class Test03_2_Inner1 {
		void printStar() {
			System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
		}
	}
	class Test03_2_Inner2 {
		void printStar() {
			System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
		}
	}
	protected class Test03_2_Inner3 {
		void printStar() {
			System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
		}
	}
	private class Test03_2_Inner4 {
		void printStar() {
			System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
		}
	}
}