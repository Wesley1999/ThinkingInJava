/**
 * Queue
 *
 * @author 王少刚
 * @create 2018-11-08 17:57
 */
package com.wangshaogang.chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class Test04 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(8);
		queue.offer(9);
		System.out.println(queue);

		queue.remove(8);

		System.out.println(queue);


	}
}
