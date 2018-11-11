package com.wangshaogang.chapter06;
public class Test02 {
    public static void main(String[] args) {
        com.wangshaogang.chapter06.Test02_2.print(1);
        com.wangshaogang.utils.Print.print("a");
    }
}

class Test02_2 {
    public static void print(Object i) {
        System.out.println(i + " in Test02_2");
    }
}

