// 工厂模式与后期绑定
package com.wangshaogang.chapter08;

import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Test02_Fruit[] fruit = new Test02_Fruit[10];
        for (int i = 0; i < fruit.length; i++) {
            fruit[i] = factory.getFruit();
        }
        for (Test02_Fruit f : fruit) {
            f.f();
        }
    }
}

class Test02_Fruit {
    void f() {
        System.out.println("I'm fruit.");
    }
}

class Test02_apple extends Test02_Fruit {
    void f() {
        System.out.println("I'm an apple.");
    }
}

class Test02_orange extends Test02_Fruit {
    void f() {
        System.out.println("I'm an orange.");
    }
}

class Test02_banana extends Test02_Fruit {
    void f() {
        System.out.println("I'm a banana.");
    }
}

class Factory {
    private Random random = new Random();
    Test02_Fruit getFruit() {
        switch (random.nextInt(3)) {
            case 0:
                return new Test02_apple();
            case 1:
                return new Test02_orange();
            case 2:
                return new Test02_banana();
            default:
                return null;
        }
    }
}