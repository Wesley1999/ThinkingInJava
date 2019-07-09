// 继承
package com.wangshaogang.chapter07;

public class Test02 {
    private String a = "a";
    void append(String str) {
        a += str;
    }

    void appendB() {
        append("b");
    }
    void appendC() {
        append("c");
    }
    public void appendD() {
        append("d");
    }

    @Override
    public String toString() {
        return "Test02{" +
                "s='" + a + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Test02 test05 = new Test02();
        test05.appendB();
        test05.appendC();
        test05.appendD();
        System.out.println(test05);
    }
}

class Test02_2 extends Test02 {
    // 注意这个方法重写了
    @Override
    public void appendD() {
        append("new");
        // 超类
        super.appendD();
    }
    private void appendX() {
        append("X");
    }
    private void appendY() {
        append("Y");
    }

    public static void main(String[] args) {
        Test02_2 test05_2 = new Test02_2();
        test05_2.appendB();
        test05_2.appendC();
        test05_2.appendD();
        test05_2.appendX();
        test05_2.appendY();
        System.out.println(test05_2);
        System.out.println("Base Class...");
        Test02.main(args);
    }
}
