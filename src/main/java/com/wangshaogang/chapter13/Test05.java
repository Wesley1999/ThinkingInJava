/**
 * 格式化输出
 *
 * @author 王少刚
 * @create 2018-11-10 13:00
 */
package com.wangshaogang.chapter13;

public class Test05 {
	public static void main(String[] args) {

		System.out.format("hello\n" + "world\n");

		char a = 'a';
		System.out.printf("%c\n", a);

		String b = "bbbbb";
		System.out.printf("%s\n", b);

		int c = 11111;
		System.out.printf("%d\n", c);
		System.out.printf("%f\n", c/1.0);

		double d = 3.14159;
		System.out.printf("%f\n", d);
		System.out.printf("%.2f\n", d);


	}
}
