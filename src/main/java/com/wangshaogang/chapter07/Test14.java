// private方法不是基类接口的一部分，如果在导出类中写一个同名的方法，不会重写基类方法，没有覆盖基类方法。
package com.wangshaogang.chapter07;

public class Test14 {
    private void f1() {
        System.out.println("This is f1() in Test14");
    }
}

class Test14_2 extends Test14 {
    private void f1() {
        System.out.println("11111111");
    }

    public static void main(String[] args) {
        Test14_2 test17_2 = new Test14_2();
        test17_2.f1();
    }
}
