/**
 * String类
 *
 * @author 王少刚
 * @create 2018-11-10 11:57
 */
package com.wangshaogang.chapter13;

public class Test04 {
	public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		char chars1[] = {'1', '2'};

		str.getChars(2,4, chars1, 0);
		System.out.println(chars1);

		char chars2[] = str.toCharArray();
		System.out.println(chars2);

		System.out.println(str.equals("ABCDEFG"));
		System.out.println(str.equalsIgnoreCase("ABCDEFG"));

		System.out.println(str.contains("a"));
		System.out.println(str.contains("A"));

		System.out.println(str.replace("abc", "ABC"));

		String str2 = " 1 2 3 ";
		System.out.println(str2);
		System.out.println(str2.trim());
	}
}
