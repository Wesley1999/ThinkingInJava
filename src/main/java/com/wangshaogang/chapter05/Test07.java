// 变量初始化

package com.wangshaogang.chapter05;

public class Test07 {
    // 类中的变量可以不初始化
    static double d;
    public static void main(String[] args) {
        System.out.println(d);
    }
    static void f(){
        //方法中的变量必须初始化
//        int j;
//        System.out.println(j);
    }
}
