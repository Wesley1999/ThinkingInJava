/**
 * StringBuilder
 *
 * @author 王少刚
 * @create 2018-11-09 22:29
 */
package com.wangshaogang.chapter13;

public class Test03 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("aaaa");
		sb.insert(1, "bbbb");
		System.out.println(sb);
		sb.append("cccc");
		System.out.println(sb);

		String str = sb.toString();
		System.out.println(str);

		sb.replace(2, 5, "ddd");
		System.out.println(sb);

		System.out.println(sb.substring(2, 5));
		System.out.println(sb);
		System.out.println(sb.reverse());

	}
}
