/**
 * @author 王少刚
 * @create 2018-11-16 10:22
 */
package com.wangshaogang.chapter14.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceDynamicProxy implements InvocationHandler {
	private UserService us;
	// 构造方法要求必需把要执行方法的对象传进来
	public UserServiceDynamicProxy(UserService us) {
		this.us = us;
	}

	// 调用这个方法返回UserService的代理对象
	public UserService getUserServiceProxy() {
		// 生成动态代理
		/**
		 * 参数1：类加载器，用来加载动态代理类，随便传一个对象
		 * 参数2：被代理对象的接口组成的数组
		 * 参数3：指定动态代理要增强的内容，要求传一个InvocationHandler接口，可以用factory去实现，参数直接写this
		 */
		UserService usProxy = (UserService) Proxy.newProxyInstance(UserServiceDynamicProxy.class.getClassLoader(),
				UserServiceImpl.class.getInterfaces(),
				this);
		return usProxy;
	}

	@Override
	/**
	 * 参数1：代理对象
	 * 参数2：委托类的方法
	 * 参数3：方法执行的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// 增强
		System.out.println("打开事务");
		/**
		 * 原本方法的调用
		 * 参数1：执行方法的对象
		 * 参数2：方法执行的参数
		 */
		Object invoke = method.invoke(us, args);
		// 增强
		System.out.println("关闭事务");
		return invoke;
	}
}
