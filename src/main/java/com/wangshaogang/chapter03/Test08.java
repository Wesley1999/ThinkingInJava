// 练习-自定义比较串相等方法
package com.wangshaogang.chapter03;
import static com.wangshaogang.utils.Print.*;

class MyString {
    String a;
    MyString(String string) {
        this.a = string;
    }

    @Override
    public String toString() {
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        char[] c1 = a.toCharArray();
        char[] c2 = ((String)obj).toCharArray();
        if (c1.length == c2.length) {
            for (int i=0; i<c1.length; i++) {
                if ((int) c1[i] != (int) c2[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}

public class Test08 {
    public static void main(String[] args) {
        MyString ms = new MyString("This is a String.");
        print(ms.equals("This is a String."));
    }
}
