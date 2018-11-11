// this的用法之一：在构造器中调用构造器
package com.wangshaogang.chapter05;

class Test04 {
    public static void main(String[] args) {
        new Test04();
    }
    public Test04() {
        this("在这里调用下一个构造方法");
        System.out.println("This is Test01().");
    }
    public Test04(String str) {
        System.out.println("This is Test01(String str).");
    }
}
