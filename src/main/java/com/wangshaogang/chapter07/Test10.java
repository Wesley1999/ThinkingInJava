// 编译期常量 static final
package com.wangshaogang.chapter07;

import java.util.Random;

public class Test10 {
    public static final int I = new Random().nextInt();
    static int j = new Random().nextInt();
    final int k = new Random().nextInt();
    int l = new Random().nextInt();
    public static void main(String[] args) {
        for (int r: com.wangshaogang.utils.Range.range(5)) {
            Test10 test13 = new Test10();
            // j会被改变，I不能
            test13.j = r;
            System.out.println(test13.I + "\t" + test13.j + "\t" + test13.k + "\t" + test13.l);
        }
    }
}
