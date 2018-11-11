// 模拟抛硬币
package com.wangshaogang.chapter03;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.print("请输入模拟抛硬币的次数：");
        int times = new Scanner(System.in).nextInt();
        for (int i=0; i<times; i++) {
            System.out.print((new Random().nextBoolean() == true ? "正" : "反") + ((i + 1) % 50 == 0 ? "\n" : " "));
        }
    }
}
