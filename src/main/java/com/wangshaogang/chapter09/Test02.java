/**
 * 接口
 *
 * @author 王少刚
 * @create 2018-10-17 19:18
 */
package com.wangshaogang.chapter09;

public class Test02 {
    public static void main(String[] args) {
        Test02_Fruit test02_fruit = new Test02_Apple();
        System.out.println(test02_fruit.f());
    }
}

interface Test02_Fruit {
    // abstract是冗余的
//    abstract void f();
    Object f();
}

class Test02_Apple implements Test02_Fruit {
    // 这里用到了协变
    public String f() {
        return "I'm an apple.";
    }
}