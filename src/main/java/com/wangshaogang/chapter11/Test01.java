/**
 * ArrayList对比LinkedList
 *
 * @author 王少刚
 * @create 2018-11-08 16:26
 */
package com.wangshaogang.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random random = new Random(727);
		long time1 = System.currentTimeMillis();

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) { list.add(random.nextInt()); }
		long time2 = System.currentTimeMillis();
		System.out.println("添加1000000个数运行时间： " + (time2 - time1) + "ms");

		for (int i = 0; i < 1000; i++) { Integer temp = list.get(random.nextInt(list.size())) + 1; }
		long time3 = System.currentTimeMillis();
		System.out.println("随机访问1000个数运行时间： " + (time3 - time2) + "ms");

		for (int i = 0; i < 1000; i++) { list.remove(0); }
		long time4 = System.currentTimeMillis();
		System.out.println("随机删除1000个数运行时间： " + (time4 - time3) + "ms");

	}
}
