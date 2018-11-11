/**
 * Map
 *
 * @author 王少刚
 * @create 2018-11-08 21:49
 */
package com.wangshaogang.chapter11;

import java.util.HashMap;
import java.util.Map;

public class Test07 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(100, "aaa");
		map.put(101, "bbb");
		map.put(102, "ccc");
		map.put(103, "ddd");
		map.put(104, "eee");

		System.out.println(map);

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(200, "xxx");
		map2.put(201, "yyy");
		map.putAll(map2);

		System.out.println(map);

		System.out.println(map.containsKey(100));
		System.out.println(map.containsKey(111));
		System.out.println(map.containsValue("aaa"));
		System.out.println(map.containsValue("AAA"));

	}
}
