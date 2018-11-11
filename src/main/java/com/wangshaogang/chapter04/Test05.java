// 无聊写了个乘法口诀表，发现现在一两分钟就可以搞定
package com.wangshaogang.chapter04;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        while(true){
            try{
                int number = new Scanner(System.in).nextInt();
                for (int i = 1; i <= (number); i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i + "*" + j + "=" + i*j + "\t");
                    }
                    System.out.println();
                }
            } catch (Exception e) {
                continue;
            }

        }

    }

}
