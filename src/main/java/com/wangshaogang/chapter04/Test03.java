// 测试自定义方法range()
package com.wangshaogang.chapter04;


import static com.wangshaogang.utils.Range.*;
import static com.wangshaogang.utils.Print.*;

public class Test03 {
    public static void main(String[] args) {
        int[] numbers1 = range(0);
        print(numbers1, " ", "\n");
        int[] numbers2 = range(3, 10);
        print(numbers2, " ", "\n");
        int[] numbers3 = range(3, 100, 7);
        print(numbers3, " ", "\n");
    }
}
