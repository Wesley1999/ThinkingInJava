/**
 * Set
 *
 * @author 王少刚
 * @create 2018-11-08 20:32
 */
package com.wangshaogang.chapter11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test06 {
	public static void main(String[] args) {
		Random random = new Random(47);
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < 5; i++) {
			set.add(random.nextInt(30));
		}

//		System.out.println(set);

//		for (Integer integer : set) {
//			System.out.print(integer + "\t");
//		}
		System.out.println(set.contains(2));
	}
}
