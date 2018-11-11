/**
 * String是不可变的
 *
 * @author 王少刚
 * @create 2018-11-09 21:52
 */
package com.wangshaogang.chapter13;

public class Test01 {
	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = str1;
		str1 = "bbb";
		System.out.println(str1);
		System.out.println(str2);
	}
}
