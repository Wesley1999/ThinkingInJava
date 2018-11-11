/**
 * 自定义异常
 *
 * @author 王少刚
 * @create 2018-11-08 22:49
 */
package com.wangshaogang.chapter12;

public class Test03 {
	void f1() throws Test03_Exception1 {
		System.out.println("Throw Test03_Exception1 in f1()");
		throw new Test03_Exception1();
	}
	void f2() throws Test03_Exception2 {
		System.out.println("Throw Test03_Exception1 in f2()");
		throw new Test03_Exception2();
	}
	void f3() throws Test03_Exception2 {
		System.out.println("Throw Test03_Exception1 in f3()");
		throw new Test03_Exception2("This is msg.");
	}

	public static void main(String[] args) {
		Test03 test03 = new Test03();
		try {
			test03.f1();
		} catch (Test03_Exception1 test03_exception1) {
//			test03_exception1.printStackTrace();
			System.out.println("Test03_Exception1 has been caught!");
		}
		System.out.println("---------------------------------");
		try {
			test03.f2();
		} catch (Test03_Exception2 test03_exception2) {
//			test03_exception2.printStackTrace();
			System.out.println("Test03_Exception2 has been caught!");
		}
		System.out.println("---------------------------------");
		try {
			test03.f3();
		} catch (Test03_Exception2 test03_exception2) {
//			test03_exception2.printStackTrace();
			System.out.println("Test03_Exception2 has been caught!");
		}
	}
}

class Test03_Exception1 extends Exception{}
class Test03_Exception2 extends Exception{
	Test03_Exception2(){}
	Test03_Exception2(String msg){ super(msg); }

}