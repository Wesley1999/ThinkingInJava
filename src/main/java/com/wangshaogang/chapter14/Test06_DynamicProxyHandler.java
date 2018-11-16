/**
 * 动态代理
 * @author 王少刚
 * @create 2018-11-15 21:05
 */
package com.wangshaogang.chapter14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Interface {
	void doSomething();
}
class RealObject implements Interface {
	public void doSomething() {
		System.out.println("doSomething()");
	}
}

public class Test06_DynamicProxyHandler implements InvocationHandler {
	private Object proxied;
	public Test06_DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("打开事务");
		Object invoke = method.invoke(proxied, args);
		System.out.println("关闭事务");
		return invoke;
	}
}

class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
	}
	public static void main(String[] args) {
		RealObject realObject = new RealObject();
		Interface proxy = (Interface) Proxy.newProxyInstance(
				Interface.class.getClassLoader(),
				new Class[]{ Interface.class},
				new Test06_DynamicProxyHandler(realObject));
		consumer(proxy);
	}
}
