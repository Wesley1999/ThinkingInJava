/**
 * 九九乘法口诀表
 *
 * @author 王少刚
 * @create 2019-01-14 21:58
 */
package com.wangshaogang.bilibili;

import com.wangshaogang.utils.Print;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {

		int k = new Scanner(System.in).nextInt();

		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= i; j++) {
				Print.print(j + "*" + i + "=" + j * i, "\t");
			}
			Print.print("");
		}
	}
}
