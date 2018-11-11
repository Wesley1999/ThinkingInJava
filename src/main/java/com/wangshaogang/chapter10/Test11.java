/**
 * 嵌套类（static内部类）
 *
 * @author 王少刚
 * @create 2018-10-24 21:48
 */
package com.wangshaogang.chapter10;

public class Test11 {
	public static void main(String[] args) {
		new Test11_2.Test11_2_2();
	}
}

class Test11_2 {
	int i = 1;

	static class Test11_2_2 {
		static int j = 2;
		{
			// 嵌套类不能与外部通信
//			System.out.println(i);
			System.out.println(j);
		}
	}

	class Test11_3 {
		// 普通类不能有static字段和类
//		static int j = 2;
//		static class Test11_3_2 { }
	}
}