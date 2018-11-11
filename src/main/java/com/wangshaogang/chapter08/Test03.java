// 向上转型访问域

package com.wangshaogang.chapter08;
import lombok.Getter;

public class Test03 {
    public static void main(String[] args) {
        // 这里进行了向上转型
        Test03_2 test03 = new Test03_3();
        System.out.println(test03.i);
        System.out.println(test03.getI());
        /**
         * 这两种方式得到的结果不同，因为直接访问域得到的是基类的域
         * 调用get方法访问得到的是导出类的域
         * 导出类的get方法必需重写
         */
    }
}


@Getter
class Test03_2 {
    public int i = 1;
}

@Getter
class Test03_3 extends Test03_2 {
    public int i = 2;
}