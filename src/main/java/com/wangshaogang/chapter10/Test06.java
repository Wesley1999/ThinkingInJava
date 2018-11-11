/**
 * 无参匿名内部类
 *
 * @author 王少刚
 * @create 2018-10-23 16:43
 */
package com.wangshaogang.chapter10;

public class Test06 {
	Test06_2 getAnonymousInnerClass() {
		return new Test06_2() {
			int i = 2;
			int j = 3;
			void printStar() {
				System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
			}
			int getI() {
				return i;
			}
		};
	}

	public static void main(String[] args) {
		Test06 test06 = new Test06();
		Test06_2 anonymousTest06 = test06.getAnonymousInnerClass();
		anonymousTest06.printStar();
		// 注意，这样种方式去到的值是不一样的
		// 向上转型直接访问域得到的是基类的域，调用方法访问得到的是导出类的域（导出类需要重写get方法），所以成员变量要设置为private，用get方法访问，来避免这样的问题。
		System.out.println(anonymousTest06.i);
		System.out.println(anonymousTest06.getI());

	}
}

class Test06_2 {
	int i = 1;
	void printStar() {
		System.out.println("⭐⭐");
	}
	int getI() {
		return i;
	}
}
