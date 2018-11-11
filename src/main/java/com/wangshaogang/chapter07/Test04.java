// 有参基类构造器
package com.wangshaogang.chapter07;

public class Test04 {
    Test04(int i) {
        System.out.println("Test04(" + i + ")");
    }
}

class Test04_2 extends Test04 {
    Test04_2(int i) {
        super(i);
        System.out.println("Test04_2(" + i + ")");
    }

    public static void main(String[] args) {
        new Test04_2(1);
    }
}
