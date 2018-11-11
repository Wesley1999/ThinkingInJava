/**
 * 基本异常
 *
 * @author 王少刚
 * @create 2018-11-08 22:00
 */
package com.wangshaogang.chapter12;

public class Test01 {
	public static void main(String[] args) {
		try {
			int i = 1 / 0;
		} catch (Exception e) {
			System.out.println("出现了错误！");
		}
	}
}
