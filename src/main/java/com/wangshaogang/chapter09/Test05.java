/**
 * 接口的多继承
 *
 * @author 王少刚
 * @create 2018-10-19 9:10
 */
package com.wangshaogang.chapter09;

public class Test05 {
    public static void main(String[] args) {
        Test05_5 test05_5 = new Test05_5();
        test05_5.f1();
        test05_5.f2();
        test05_5.f3();
        test05_5.f4();
    }
}

interface Test05_2 {
    void f1();
    void f2();
}

interface Test05_3 {
    // 同名且同返回类型是可以用于多继承的
    void f1();

    // 如果写了这一行，Test05_4就不能实现多继承，因为有同名不同返回类型的抽象方法
//    int f2();
    void f3();
}

interface Test05_4 extends Test05_2, Test05_3 {
    void f4();
}

class Test05_5 implements Test05_4 {
    public void f1() { }
    public void f2() { }
    public void f3() { }
    public void f4() { }
}
