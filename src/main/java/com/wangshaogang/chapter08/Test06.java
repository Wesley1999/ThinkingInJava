// 协变返回类型
package com.wangshaogang.chapter08;

import lombok.ToString;

public class Test06 {
    public static void main(String[] args) {
        Test06_4 test06_4 = new Test06_4();
        Test06_5 test06_5 = new Test06_5();
        System.out.println(test06_4);
        System.out.println(test06_5);
    }
}

class Test06_2 {}
class Test06_3 extends Test06_2 {}

@ToString
class Test06_4 {
    Test06_2 getObject() {return new Test06_2();}
}

@ToString
class Test06_5 extends Test06_4 {
    // 虽然返回值类型不同，但这样的重写是可行的
    @Override
    Test06_3 getObject() {return new Test06_3();}
}
