// 向上转型1
package com.wangshaogang.chapter08;

public class Test01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.ate(apple);
    }
}

class Fruit {
    void ate(Fruit f) {
        System.out.println("I'm ate.");
    }
}

class Apple extends Fruit {}