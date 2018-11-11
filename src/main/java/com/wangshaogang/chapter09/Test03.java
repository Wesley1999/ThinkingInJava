/**
 * 适配器
 * 瞎几把写的不知道对不对
 *
 * @author 王少刚
 * @create 2018-10-17 21:28
 */
package com.wangshaogang.chapter09;


public class Test03 {
    public static void main(String[] args) {
        Test03_1 test03_1_1 = new Test03_1_1();
        Test03_1 test03_1_2 = new Test03_1_2();
        Test03_1 test03_1_3 = new Test03_1_3();
        Test03_3[] test03_3 = {new Test03_3(test03_1_1), new Test03_3(test03_1_2), new Test03_3(test03_1_3)};
        System.out.println(test03_3[0].process(test03_1_1));
        System.out.println(test03_3[1].process(test03_1_2));
        System.out.println(test03_3[2].process(test03_1_3));
    }
}

class Test03_1 { }
class Test03_1_1 extends Test03_1 { }
class Test03_1_2 extends Test03_1 { }
class Test03_1_3 extends Test03_1 { }

interface Test03_2 {
    Object process(Object object);
}

class Test03_3 implements Test03_2 {
    Test03_1 test03_1;

    public Test03_3(Test03_1 test03_1) {
        this.test03_1 = test03_1;
    }

    public Test03_1 process(Object object) {
        return (Test03_1) object;
    }
}
