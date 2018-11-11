// 重写
package com.wangshaogang.chapter07;

public class Test06 {
    void f1() {
        System.out.println("This is f1() in Test06");
    }
    void f2(int i) {
        System.out.println("This is f1(int i) in Test06");
    }
    void f3() {
        System.out.println("This is f3() in Test06");
    }
}

class Test06_2 extends Test06 {
    @Override
    void f1() {
        System.out.println("This is f1() in Test06_2");
    }

    // 这里使用注解@Override编译会报错，因为方法被重载了
//    @Override
    void f2(String s) {
        System.out.println("This is f1(String s) in Test06_2");
    }

    @Override
    void f3() {
        System.out.println("This is f3() in Test06_2");
    }
}

class Test06_3 {
    public static void main(String[] args) {
        Test06_2 test09_2 = new Test06_2();
        test09_2.f1();
        test09_2.f2("1");
        test09_2.f3();
    }
}



