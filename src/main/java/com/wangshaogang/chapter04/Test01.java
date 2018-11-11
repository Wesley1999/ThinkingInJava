// foreach 循环
package com.wangshaogang.chapter04;

import java.util.Random;
import static com.wangshaogang.utils.Print.*;

public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt();
        }
        for (int j: numbers) {
            print(j, " ");
        }

    }
}
