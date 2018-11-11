/**
 * 内部类创建对象
 *
 * @author 王少刚
 * @create 2018-10-23 16:16
 */
package com.wangshaogang.chapter10;

public class Test01 {
	int i = 1;
	class Test01_2{
		void printI() {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Test01 test01 = new Test01();
		Test01_2 test01_2 = test01.new Test01_2();
		test01_2.printI();
	}
}
