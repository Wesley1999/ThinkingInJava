/**
 * 抛出异常
 *
 * @author 王少刚
 * @create 2018-11-08 22:04
 */
package com.wangshaogang.chapter12;

public class Test02 {
	public static void main(String[] args) {
		try {
			throwException();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException has been caught!");
		}
	}

	static void throwException() throws NullPointerException {
		System.out.println("There is nothing wrong, but I want to throw an Exception!");
		throw new NullPointerException("This is the information of the Exception.");
	}
}

