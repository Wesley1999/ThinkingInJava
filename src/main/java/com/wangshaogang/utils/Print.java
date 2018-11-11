/**
 * 打印相关的方法
 * @author 王少刚
 * @create 2018-10-17 17:26
 */
package com.wangshaogang.utils;

public class Print {
    /**
     * 打印一个字符串，以回车符结束
     *
     * @param object 方法System.out.println()的参数
     */
    public static void print(Object object) {
        if (object == null) {
            System.out.println("null");
            return;
        }
        System.out.println(object);
    }

    /**
     * 打印一个字符串，自定义结束符
     *
     * @param object 方法System.out.println()的参数
     * @param 结束符    结束符
     */
    public static void print(Object object, String 结束符) {
        if (object == null) {
            System.out.print("null");
            System.out.print(结束符);
            return;
        }
        System.out.print(object);
        System.out.print(结束符);
    }

    /**
     * 打印一个int数组，以回车符结束
     *
     * @param ints 方法System.out.println()的参数
     */
    public static void print(int[] ints) {
        if (ints == null) {
            System.out.print("null");
            return;
        }
        for (int i : ints) {
            System.out.println(i);
        }
    }

    /**
     * 打印一个int数组，自定义分隔符
     *
     * @param ints 方法System.out.println()的参数
     * @param 分隔符  分隔符
     */
    public static void print(int[] ints, String 分隔符) {
        if (ints == null) {
            System.out.print("null");
            return;
        }
        for (int i : ints) {
            System.out.print(i);
            System.out.print(分隔符);
        }
        System.out.println();
    }

    /**
     * 打印一个int数组，自定义分隔符和结束符
     *
     * @param ints 方法System.out.println()的参数
     * @param 分隔符  分隔符
     */
    public static void print(int[] ints, String 分隔符, String 结束符) {
        if (ints == null) {
            System.out.print("null");
            System.out.print(结束符);
            return;
        }
        for (int i : ints) {
            System.out.print(i);
            System.out.print(分隔符);
        }
        System.out.print(结束符);
    }


}
