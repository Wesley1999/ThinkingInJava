/**
 * Stack
 *
 * @author 王少刚
 * @create 2018-11-08 17:49
 */
package com.wangshaogang.chapter11;

import java.util.Random;
import java.util.Stack;

public class Test03 {
	public static void main(String[] args) {
		Random random = new Random(727);

		Stack<Integer> stact = new Stack();
		stact.add(1);
		stact.add(2);
		stact.add(3);
		stact.add(4);
		stact.add(5);
		System.out.println(stact);
		stact.push(88);
		System.out.println(stact);
		stact.pop();
		System.out.println(stact);
		stact.pop();
		System.out.println(stact);

	}

}
