// 测试标签
package com.wangshaogang.chapter04;

public class Test04 {
    public static void main(String[] args) {
        label1:
        for(int i=0; i<50; i++){
            for(int j=i; j<50+i; j++){
                System.out.print(j + " ");
//                直接使用break语句，无法跳出外部循环。
//                if (j > 80) {
//                    break ;
//                }
                if (j >= 80) {
                    break label1;
                }
            }
            System.out.println();
        }
    }
}
