// equals()方法需要重写才能表现出我们想要的行为
package com.wangshaogang.chapter03;

public class Test04 {
    int i;
}

class Test04_1 {
    public static void main(String[] args) {
        Test04 t1 = new Test04();
        Test04 t2 = new Test04();
        t1.i = t2.i = 1;
        System.out.println(t1.i);
        System.out.println(t2.i);
        System.out.println(t1.equals(t2));
    }
}
