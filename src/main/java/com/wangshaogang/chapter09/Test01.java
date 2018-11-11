/**
 * 抽象类和抽象方法
 *
 * @author 王少刚
 * @create 2018-10-17 17:26
 */
package com.wangshaogang.chapter09;

public class Test01 {
    public static void main(String[] args) {
        Test01_Fruit fruit1 = new Test01_Apple();
        Test01_Fruit fruit2 = new Test01_Banana();
        Test01_Fruit fruit3 = new Test01_Orange();

        fruit1.f();
        fruit2.f();
        fruit3.f();
    }
}

abstract class Test01_Fruit {
    void f0(){};
    // 抽象方法
    abstract void f();
}

class Test01_Apple extends Test01_Fruit {
    void f() {
        System.out.println("I'm an apple.");
    }
}

class Test01_Banana extends Test01_Fruit {
    void f() {
        System.out.println("I'm an banana.");
    }
}

class Test01_Orange extends Test01_Fruit {
    void f() {
        System.out.println("I'm an orange.");
    }
}