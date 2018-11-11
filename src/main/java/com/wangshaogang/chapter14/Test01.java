/**
 * RTTI
 *
 * @author 王少刚
 * @create 2018-11-11 13:37
 */
package com.wangshaogang.chapter14;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public String f() {
		return this + ".f()";
	}

	public static void main(String[] args) {
		List<Test01> test01s = new ArrayList<Test01>();
		test01s.add(new Test01_2());
		test01s.add(new Test01_3());
		test01s.add(new Test01_4());
		for (Test01 test01 : test01s) {
			System.out.println(test01.f());
		}
	}
}

@ToString
class Test01_2 extends Test01 {}
@ToString
class Test01_3 extends Test01 {}
@ToString
class Test01_4 extends Test01 {}


