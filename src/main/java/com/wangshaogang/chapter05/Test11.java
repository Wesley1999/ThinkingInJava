// 可变参数的错误
package com.wangshaogang.chapter05;

public class Test11 {
    public static void main(String[] args) {
        // 这样会报错
//        f('a', 'b');
    }
    static void f(float i, Character... characters) {
        System.out.println("f1");
    }
    static void f(Character... characters) {
        System.out.println("f2");
    }
}
