// 创建导出类的对象，会先调用基类的构造器
package com.wangshaogang.chapter07;

public class Test03 {
    Test03() {
        System.out.println("Test03");
    }
}

class Test03_2 extends Test03 {
    Test03_2() {
        System.out.println("Test03_2");
    }
}

class Test03_3 extends Test03_2 {
    Test03_3() {
        super();    //空参可以省略这条语句
        System.out.println("Test03_3");
    }

    public static void main(String[] args) {
        new Test03_3();
        new Test03_3();
    }
}
