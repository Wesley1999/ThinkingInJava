package com.wangshaogang.chapter03;

public class Test01{
    int value;
}

class Test01_1{
    public static void main(String[] args) {
        Test01 a = new Test01();
        a.value = 1;
        Test01 b = a;
        System.out.println(a.value);
        System.out.println(b.value);
        b.value = 2;
        System.out.println(a.value);
        System.out.println(b.value);
    }
}
