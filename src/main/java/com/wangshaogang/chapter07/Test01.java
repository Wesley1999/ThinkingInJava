// 组合
package com.wangshaogang.chapter07;

public class Test01 {
    public static void main(String[] args) {
        Test01_3 test04_3 = new Test01_3();
        System.out.println(test04_3);
    }
}

class Test01_2 {
    String string = "Test01_2(1)";
    String string2;
    String string3;
    String string4;
    Test01_2() {
        string2 = "Test01_2(2)";
    }
    {
        string3 = "Test01_2(3)";
    }

    @Override
    public String toString() {
        return "Test01_2{" +
                "string='" + string + '\'' +
                ", string2='" + string2 + '\'' +
                ", string3='" + string3 + '\'' +
                ", string4='" + string4 + '\'' +
                '}';
    }
}

class Test01_3 {
    String string = "Test01_3";
    Test01_2 test04_2 = new Test01_2();

    @Override
    public String toString() {
        return "Test01_3{" +
                "string='" + string + '\'' +
                ", test04_2=" + test04_2 +
                '}';
    }
}