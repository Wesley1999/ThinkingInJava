// final参数
package com.wangshaogang.chapter07;

public class Test12 {
    void cannotChange (final int i) {
        // 不可改变值
//        i += 1;
    }
    void cannotChange2 (final Test12 test15) {
        // 不可改变引用
//        test15 = new Test12();

    }
}
