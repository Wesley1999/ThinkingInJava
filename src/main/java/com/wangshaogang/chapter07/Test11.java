// 空白final
package com.wangshaogang.chapter07;

import lombok.Getter;

@Getter
public class Test11 {
    final int a;
    Test11(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test11 test14 = new Test11(1);
//        test14.a = 2;
        Test11 test14_2 = new Test11(2);
        System.out.println(test14.getA());
        System.out.println(test14_2.getA());
    }
}
