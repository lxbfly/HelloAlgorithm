/**
 * IteratorThree.java   2013-5-16 下午11:13:07 by gavin 
 *
 * Copyright (c) 2000 - 2013 Gavin Lee. All rights reserved.
 * 
 */
package com.xuebing.algorithm.basis.search.binary;

public class IteratorThree {
    public static int recusionBinarySearch(int[] dataSet, int key, int low, int high) {
        int mid = (low + high) >>> 1;
        if (key < dataSet[low] || key > dataSet[high] || low > high) {
            return -1;
        }
        if (key < dataSet[mid]) {
            return recusionBinarySearch(dataSet, key, low, mid - 1);
        } else if (key > dataSet[mid]) {
            return recusionBinarySearch(dataSet, key, mid + 1, high);
        } else {
            return mid;
        }
    }
}