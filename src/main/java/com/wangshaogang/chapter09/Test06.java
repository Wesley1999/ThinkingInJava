/**
 * 适配接口
 *
 * @author 王少刚
 * @create 2018-10-19 9:22
 */
package com.wangshaogang.chapter09;

public class Test06 {
    public static void main(String[] args) {
        // Test06_5实现了接口Test06_2，可以用来构造Test06_3，尽管Test06_5也实现了其他的接口。
        new Test06_3(new Test06_5());
    }
}

interface Test06_2 {
    void f2();
}

class Test06_3 implements Test06_2 {
    public void f2() {}

    Test06_3(Test06_2 test06_2) {
        System.out.println("构造Test06_3成功！");
    }
}

interface Test06_4 {
    void f4();
}

class Test06_5 implements Test06_2, Test06_4 {
    public void f2() {

    }

    public void f4() {

    }
}


