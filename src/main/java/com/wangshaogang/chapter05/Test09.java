// 数组
package com.wangshaogang.chapter05;

import static com.wangshaogang.utils.Print.print;

public class Test09 {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 8, 9, 10};
        int[] j = new int[i.length];
        // 这样复制的是引用
//        j = i;
        for (int k=0; k<i.length; k++) {
            j[k] = i[k];
        }
        print(i, " ");
        print(j, " ");
        i[0] = 100;
        print(i, " ");
        print(j, " ");
    }
}
