// 静态方法
package com.wangshaogang.chapter05;

public class Test06 {
    public static void main(String[] args) {
        Test06_2.f1();
    }

}
class Test06_2 {
    static void f1(){
        System.out.println("This is f1()");
        // 静态方法中不能调用非静态方法
//        f2();

    }
    void f2(){
        System.out.println("This is f2()");

    }
}
