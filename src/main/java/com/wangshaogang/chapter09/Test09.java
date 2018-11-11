/**
 * 工厂方法
 *
 * @author 王少刚
 * @create 2018-10-22 21:30
 */
package com.wangshaogang.chapter09;


public class Test09 {
	public static void main(String[] args) {
		Service service1 = Factory.getService(new ImplementFactory1());
		Service service2 = Factory.getService(new ImplementFactory2());
		service1.method1();
		service1.method2();
		service2.method1();
		service2.method2();
	}
}

interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}


class ImplementService1 implements Service {
	public void method1() {
		System.out.println("ImplementService1 method1");
	}

	public void method2() {
		System.out.println("ImplementService1 method2");
	}
}

class ImplementService2 implements Service {
	public void method1() {
		System.out.println("ImplementService2 method1");
	}

	public void method2() {
		System.out.println("ImplementService2 method2");
	}
}

class ImplementFactory1 implements ServiceFactory {
	public Service getService() {
		return new ImplementService1();
	}
}

class ImplementFactory2 implements ServiceFactory {
	public Service getService() {
		return new ImplementService2();
	}
}

class Factory {
	public static Service getService(ServiceFactory serviceFactory) {
		return serviceFactory.getService();
	}
}

