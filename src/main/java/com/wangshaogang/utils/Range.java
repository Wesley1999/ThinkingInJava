/**
 * 生成数组的方法
 * @author 王少刚
 * @create 2018-10-17 17:26
 */

package com.wangshaogang.utils;

public class Range {
    /**
     * 生成一个0到max的数组，不包含max
     *
     * @param max 要生成的最大值，不包含
     * @return
     */
    public static int[] range(int max) {
        if (max <= 0) {
            return null;
        } else {
            int[] range = new int[max];
            for (int i = 0; i < max; i++) {
                range[i] = i;
            }
            return range;
        }
    }

    /**
     * 生成一个min到max的数组，不包含max
     *
     * @param min 要生成的最小值
     * @param max 要生成的最大值，不包含
     * @return
     */
    public static int[] range(int min, int max) {
        if (max <= min) {
            return null;
        } else {
            int[] range = new int[max - min];
            for (int i = min, index = 0; index < max - min; i++, index++) {
                range[index] = i;
            }
            return range;
        }
    }

    /**
     * 生成一个min到max的数组，不包含max
     *
     * @param min  要生成的最小值
     * @param max  要生成的最大值，不包含
     * @param step 数据间隔
     * @return
     */
    public static int[] range(int min, int max, int step) {
        if (max <= min + step) {
            return null;
        } else {
            int[] range = new int[(max - min) / step];
            for (int i = min, index = 0; index < (max - min) / step; i++) {
                if ((i - min) % step == 0) {
                    range[index] = i;
                    index++;
                }
            }
            return range;
        }
    }
}
