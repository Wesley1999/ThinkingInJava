// 向下转型
package com.wangshaogang.chapter08;

import lombok.ToString;

public class Test07 {
    public static void main(String[] args) {

        // 这样的转型是可以的
        Test07_2 test07_2 = new Test07_4();
        System.out.println((Test07_3) test07_2);
        System.out.println((Test07_4) test07_2);

        // 这样的转型会报错
        Test07_3 test07_3 = new Test07_3();
        try {
            System.out.println((Test07_4) test07_3);
        } catch (Exception e) {
            System.out.println("捕获了异常：" + e.getClass());
        }
    }
}

@ToString
class Test07_2 {}
@ToString
class Test07_3 extends Test07_2 {}
@ToString
class Test07_4 extends Test07_3 {}
