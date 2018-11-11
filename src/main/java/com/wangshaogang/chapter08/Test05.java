// 在构造方法中调用正在构造的对象的动态绑定方法
package com.wangshaogang.chapter08;

public class Test05 {
    public static void main(String[] args) {
        new Test05_3();
    }
}

class Test05_2 {
    int i = 1;
    void show() {
        System.out.println("i = " + i);
    }
    Test05_2() {
        // 构造方法中调用，指定的是Test05_3()中的方法，但此时Test05_3中的i还没有初始化
        show();
    }
}

class Test05_3 extends Test05_2 {
    int i = 1;
    void show() {
        System.out.println("i = " + i);
    }
}
