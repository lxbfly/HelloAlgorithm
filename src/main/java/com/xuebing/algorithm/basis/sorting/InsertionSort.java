/**
 * InsertionSort.java   2015年5月13日 上午11:48:59 by gordon.li 
 *
 * Copyright (c) 2000 - 2015 gordon.Li. All rights reserved.
 * 
 */
package com.xuebing.algorithm.basis.sorting;

import com.xuebing.algorithm.utils.ArrayUtil;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("原数组：");
        ArrayUtil.printArray(data);
        int[] result = insertionSortAsc(data);
        //int[] result = insertionSortDesc(data);
        System.out.println("排序后的数组：");
        ArrayUtil.printArray(result);
    }

    private static int[] insertionSortAsc(int[] data) {
        if (data == null || data.length < 0) {
            throw new IllegalArgumentException("The array can't NULL or length less than zero.");
        }
        int temp = 0;
        for (int i = 1; i < data.length; i++) {
            temp = data[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (data[j] > temp) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            data[j + 1] = temp;
        }
        return data;
    }

    private static int[] insertionSortDesc(int[] data) {
        if (data == null || data.length < 0) {
            throw new IllegalArgumentException("The array can't NULL or length less than zero.");
        }
        int temp = 0;
        for (int i = 1; i < data.length; i++) {
            temp = data[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (data[j] < temp) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            data[j + 1] = temp;
        }
        return data;
    }
}
