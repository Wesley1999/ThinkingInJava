// 代理
package com.wangshaogang.chapter07;

public class Test05 {
    void f1() {
        System.out.println("This is f1() in Test05");
    }
}

class Test05_2 {
    Test05 test08 = new Test05();
    void f2() {
        test08.f1();
    }
}

class Test05_3 {
    public static void main(String[] args) {
        Test05_2 test08_2 = new Test05_2();
        // 间接用Test08_2的对象调用了Test08的方法
        test08_2.f2();
    }
}
