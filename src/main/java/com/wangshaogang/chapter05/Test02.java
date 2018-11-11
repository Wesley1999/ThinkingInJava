// 如果调用一个方法给出的参数可以满足多个重载方法，那么编译器会尽可能地去选择较小的类型，例如Object，long，int中，int会被优先选择。
package com.wangshaogang.chapter05;

public class Test02 {
    public static void f1() {
        System.out.println("This is f1()");
    }

    public static void f1(int n) {
        System.out.println("This is f1(int n)");
    }

    public static void f1(long n) {
        System.out.println("This is f1(long n)");
    }

    public static void f1(Object n) {
        System.out.println("This is f1(Object n)");
    }

    public static void main(String[] args) {
        f1(1111111L);
    }
}
