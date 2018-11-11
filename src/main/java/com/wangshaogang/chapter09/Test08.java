/**
 * 嵌套接口
 *
 * @author 王少刚
 * @create 2018-10-22 16:53
 */
package com.wangshaogang.chapter09;

public class Test08 {
	public static void main(String[] args) {
		System.out.println("啥也没有");
	}
}

// 嵌套在类中的接口可以声明为private或public，private接口可以被实现为private或public。
class Test08_2 {
	interface Test08_2_I1 { }

	public class Test08_1_C1 implements Test08_2_I1 { }

	private class Test08_1_C2 implements Test08_2_I1 { }

	private interface Test08_2_I2 { }

	public class Test08_1_C3 implements Test08_2_I2 { }

	private class Test08_1_C4 implements Test08_2_I2 { }

}

// 嵌套在接口中的接口只能是public的。
interface Test08_3 {
	interface Test08_3_I1 { }

	public class Test08_1_C1 implements Test08_3_I1 { }

//	private class Test08_1_C2 implements Test08_3_I1 { }

//	private interface Test08_3_I2 { }

//	public class Test08_1_C3 implements Test08_3_I2 { }

//	private class Test08_1_C4 implements Test08_3_I2 { }


}