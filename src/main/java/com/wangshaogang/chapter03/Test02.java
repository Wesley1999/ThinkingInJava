/*
这个例子说明向方法传递的是引用，而不是副本
 */

package com.wangshaogang.chapter03;

public class Test02{
    char c;
}

class Test02_1{
    static void f(Test02 y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Test02 x = new Test02();
        x.c = 'a';
        System.out.println(x.c);
        f(x);
        System.out.println(x.c);
    }
}
