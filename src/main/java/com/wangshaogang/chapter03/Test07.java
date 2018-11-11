// 布尔表达式的短路现象
// 测试自定义的print()方法
package com.wangshaogang.chapter03;
import static com.wangshaogang.utils.Print.*;

public class Test07 {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 1;
        // 第三个表达式不会执行
        boolean b = --i1 == 0 && i1 > i2 && --i2 == 0;
        print(i1, "\t");
        print(i2, "\t");
        print(b, "\t");
    }
}
