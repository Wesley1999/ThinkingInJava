/**
 * 再访工厂方法
 *
 * @author 王少刚
 * @create 2018-10-23 19:55
 */
package com.wangshaogang.chapter10;

public class Test09 {
	public static void main(String[] args) {

		Service service1 = Factory.getService(ImplementService1.serviceFactory);
		Service service2 = Factory.getService(ImplementService2.serviceFactory);
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

	public static ServiceFactory serviceFactory = new ServiceFactory() {
		public Service getService() {
			return new ImplementService1();
		}
	};


}

class ImplementService2 implements Service {
	public void method1() {
		System.out.println("ImplementService2 method1");
	}

	public void method2() {
		System.out.println("ImplementService2 method2");
	}

	public static ServiceFactory serviceFactory = new ServiceFactory() {
		public Service getService() {
			return new ImplementService2();
		}
	};
}

class Factory {
	public static Service getService(ServiceFactory serviceFactory) {
		return serviceFactory.getService();
	}
}


