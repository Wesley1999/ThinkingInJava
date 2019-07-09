/**
 * @author 王少刚
 * @create 2018-11-16 10:58
 */
package com.wangshaogang.chapter14.proxy;

import org.junit.Test;

public class Demo {
	@Test
	public void test() {
		UserService us = new UserServiceImpl();
		UserServiceProxy usProxy = new UserServiceProxy(us);
		usProxy.save();
	}
}
