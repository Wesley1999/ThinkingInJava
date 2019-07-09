/**
 * @author 王少刚
 * @create 2018-11-16 10:33
 */
package com.wangshaogang.chapter14.dynamic_proxy;

import org.junit.Test;

public class Demo {
	@Test
	public void test() {
		// 被代理对象
		UserService us = new UserServiceImpl();
		// 用被代理对象动态代理类
		UserServiceDynamicProxy userServiceDynamicProxy = new UserServiceDynamicProxy(us);
		// 用动态代理类创建代理对象
		UserService usProxy = userServiceDynamicProxy.getUserServiceProxy();
		// 用代理对象调用方法
		usProxy.save();
		usProxy.delete();
	}
}
