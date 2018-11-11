/**
 * 匿名内部类用构造快实现构造器的效果
 *
 * @author 王少刚
 * @create 2018-10-23 17:56
 */
package com.wangshaogang.chapter10;

import lombok.Setter;
import lombok.ToString;

public class Test08 {
	public static void main(String[] args) {
		Test08_2 test08_2 = new Test08_2();
		Test08_2 anonymousInnerClass = test08_2.getAnonymousInnerClass(619);
		System.out.println(anonymousInnerClass);
	}
}

@Setter
@ToString
class Test08_2 {
	int i = 0;
	Test08_2 getAnonymousInnerClass(final int j) {
		return new Test08_2() {
			{
				System.out.println("construct!");
				setI(j);
			}
		};
	}
}
