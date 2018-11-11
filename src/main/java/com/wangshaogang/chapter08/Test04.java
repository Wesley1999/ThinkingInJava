// 向上转型“重写”的静态方法无效，实际上静态方法不能重写
package com.wangshaogang.chapter08;

public class Test04 {
    public static void main(String[] args) {
        Test04_2 test04_3 = new Test04_3();
        System.out.println(test04_3.getStar());
    }

}

class Test04_2 {
    static String getStar() {
        return "***";
    }
}
class Test04_3 extends Test04_2 {
//    @Override
    static String getStar() {
        return "******************************";
    }
}
