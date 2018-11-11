// final方法
package com.wangshaogang.chapter07;

public class Test13 {
    final void printStars() {
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
    }
    void printSuns() {
        System.out.println("☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀");
    }
}

class Test13_2 extends Test13 {
    // final修饰的方法不能重写
//    @Override
//    void printStars() {
//        System.out.println("☀☀☀☀☀☀☀");
//    }

    @Override
    void printSuns() {
        System.out.println("☀☀☀☀☀☀☀");
    }

    public static void main(String[] args) {
        Test13_2 test16_2 = new Test13_2();
        test16_2.printStars();
        test16_2.printSuns();
    }
}
