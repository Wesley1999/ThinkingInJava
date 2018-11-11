// 继承的执行顺序
package com.wangshaogang.chapter07;

public class Test15 {
    static {
        System.out.println("测试类的静态代码");
        System.out.println("----------------");
        new Test15_4();
        System.out.println("----------------");
        new Test15_4();
        System.out.println("----------------");
    }

    {
        System.out.println("测试类的普通代码");
    }

    public static void main(String[] args) {
        System.out.println("main方法");
    }
}

class Test15_3 {
    static {
        System.out.println("基类静态");
    }

    {
        System.out.println("基类非静态");
    }

    Test15_3() {
        System.out.println("基类构造");
    }
}

class Test15_4 extends Test15_3 {
    static {
        System.out.println("导出类静态");
    }

    {
        System.out.println("导出类非静态");
    }

    Test15_4() {
        System.out.println("导出类构造");
    }
}