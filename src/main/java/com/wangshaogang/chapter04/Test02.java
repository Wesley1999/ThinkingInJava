// toCharArray方法
package com.wangshaogang.chapter04;

import static com.wangshaogang.utils.Print.*;

public class Test02 {
    public static void main(String[] args) {
        String str = "My name is wangshaogang.";
        char[] cs = str.toCharArray();
        for (char c : cs) {
            print(c);
        }
    }
}
