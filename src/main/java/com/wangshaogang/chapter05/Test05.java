// this的用法之一：返回当前对象
package com.wangshaogang.chapter05;

public class Test05 {
    public static void main(String[] args) {
        Test05_2 t = new Test05_2();
        System.out.println(t.f1().f1().f1().i);
    }
}

class Test05_2{
    int i = 0;
    Test05_2 f1(){
        i ++;
        return this;
    }
}
