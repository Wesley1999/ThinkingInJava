/**
 * @author 王少刚
 * @create 2018-11-16 10:55
 */
package com.wangshaogang.chapter14.proxy;

public class UserServiceProxy {
	private UserService us;
	// 构造方法要求必需把要执行方法的对象传进来
	public UserServiceProxy(UserService us) {
		this.us = us;
	}

	public void save() {
		System.out.println("打开事务");
		us.save();
		System.out.println("提交事务");
	}
	// ...
}
