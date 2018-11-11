// 枚举
package com.wangshaogang.chapter05;

public class Test12 {
    public static void main(String[] args) {
        Test12_2 x = new Test12_2(Test12_1.A),
                y = new Test12_2(Test12_1.B),
                z = new Test12_2(Test12_1.C);
        x.describe();
        y.describe();
        z.describe();
        System.out.println(Test12_1.A.toString());
        Test12_1 aaa = Test12_1.A;
    }
}

enum Test12_1 {
    A, B, C, D, E;
}

class Test12_2 {
    Test12_1 t;
    Test12_2(Test12_1 t) {
        this.t = t;
    }
    public void describe() {
        switch (t) {
            case A:
                System.out.println(Test12_1.A);break;
            case B:
                System.out.println(Test12_1.B);break;
            case C:
                System.out.println(Test12_1.C);break;
            case D:
                System.out.println(Test12_1.D);break;
            case E:
                System.out.println(Test12_1.E);break;
        }
    }

}
