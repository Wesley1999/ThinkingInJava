/**
 * 捕获异常
 *
 * @author 王少刚
 * @create 2018-11-09 11:22
 */
package com.wangshaogang.chapter12;

public class Test04 {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			System.out.println("Caught Exception");
			System.out.println("getMessage(): " + e.getMessage());
			System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
			System.out.println("toString(): " + e.toString());
			System.out.print("printStackTrace(): ");
			e.printStackTrace();
		}
	}
}
