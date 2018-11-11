/**
 * ArrayList
 *
 * @author 王少刚
 * @create 2018-11-08 18:56
 */
package com.wangshaogang.chapter11;

import java.util.ArrayList;

public class Test05 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(8);
		array.add(9);

		System.out.println(array);
		array.remove(new Integer(8));
		System.out.println(array);

		array.add(3,333);
		System.out.println(array);
		array.set(4, 444);
		System.out.println(array);


	}
}
