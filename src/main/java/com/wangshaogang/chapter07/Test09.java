// final
// 并不能使对象本身保持不变
package com.wangshaogang.chapter07;
import lombok.*;

public class Test09 {
    public static void main(String[] args) {
        final Test09_2 test12_2 = new Test09_2();
        System.out.println(test12_2.getA());
        test12_2.setA(1);
        System.out.println(test12_2.getA());
    }
}

@Setter
@Getter
class Test09_2 {
    int a;
}