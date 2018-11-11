/**
 * 比较相关的方法
 * 可以获取最大数和最小数，参数和返回值支持int和double类型
 * @author 王少刚
 * @create 2018-10-17 17:26
 */
package com.wangshaogang.utils;

public class Compare {

    // 获取最小

    /**
     *
     * @param i 至少需要的一个参数
     * @param ints 可选的参数
     * @return 最小的数
     */
    public static int getSmallest(int i, int... ints) {
        int temp = i;
        for (int j=0; j<ints.length; j++) {
            if (ints[j] < temp) {
                temp = ints[j];
            }
        }
        return temp;
    }

    /**
     *
     * @param d 至少需要的一个参数
     * @param doubles 可选的参数
     * @return 最小的数
     */
    public static double getSmallest(double d, double... doubles) {
        double temp = d;
        for (int j=0; j<doubles.length; j++) {
            if (doubles[j] < temp) {
                temp = doubles[j];
            }
        }
        return temp;
    }
    /**
     *
     * @param ints int数组参数
     * @return 最小的数
     */
    public static int getSmallest(int[] ints) {
        if (ints.length == 0) {
            try {
                throw new Exception("比较的参数不能是空数组");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int temp = ints[0];
        for (int j=0; j<ints.length; j++) {
            if (ints[j] < temp) {
                temp = ints[j];
            }
        }
        return temp;
    }
    /**
     *
     * @param doubles double数组参数
     * @return 最小的数
     */
    public static double getSmallest(double[] doubles) {
        if (doubles.length == 0) {
            try {
                throw new Exception("比较的参数不能是空数组");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        double temp = doubles[0];
        for (int j=0; j<doubles.length; j++) {
            if (doubles[j] < temp) {
                temp = doubles[j];
            }
        }
        return temp;
    }


    // 获取最大

    /**
     *
     * @param i 至少需要的一个参数
     * @param ints 可选的参数
     * @return 最大的数
     */
    public static int getBiggest(int i, int... ints) {
        int temp = i;
        for (int j=0; j<ints.length; j++) {
            if (ints[j] > temp) {
                temp = ints[j];
            }
        }
        return temp;
    }
    /**
     *
     * @param d 至少需要的一个参数
     * @param doubles 可选的参数
     * @return 最大的数
     */
    public static double getBiggest(double d, double... doubles) {
        double temp = d;
        for (int j=0; j<doubles.length; j++) {
            if (doubles[j] > temp) {
                temp = doubles[j];
            }
        }
        return temp;
    }
    /**
     *
     * @param ints int数组参数
     * @return 最大的数
     */
    public static int getBiggest(int[] ints) {
        if (ints.length == 0) {
            try {
                throw new Exception("比较的参数不能是空数组");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int temp = ints[0];
        for (int j=0; j<ints.length; j++) {
            if (ints[j] > temp) {
                temp = ints[j];
            }
        }
        return temp;
    }
    /**
     *
     * @param doubles double数组参数
     * @return 最大的数
     */
    public static double getBiggest(double[] doubles) {
        if (doubles.length == 0) {
            try {
                throw new Exception("比较的参数不能是空数组");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        double temp = doubles[0];
        for (int j=0; j<doubles.length; j++) {
            if (doubles[j] > temp) {
                temp = doubles[j];
            }
        }
        return temp;
    }
}
