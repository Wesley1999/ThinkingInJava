// protected
// 接package com.wangshaogang.chapter06.testpackage.Test07_3.java;
package com.wangshaogang.chapter07;

public class Test07 {
    int i;
    protected static int j = 10;
    protected Test07(int i) {
        this.i = i;
    }

    // 无法在包之外被继承
    int getI() {
        return i;
    }
    protected void setI(int i) {
        this.i = i;
    }
}

class Test07_2 extends Test07 {
    Test07_2(int i) {
        super(i);
    }

    public static void main(String[] args) {
        Test07_2 test10_2 = new Test07_2(1);
        test10_2.setI(2);
        System.out.println(test10_2.getI());
        System.out.println(j);
    }
}
