/**
 * IteratorFive.java   2013-5-17 上午7:50:34 by gavin 
 *
 * Copyright (c) 2000 - 2013 Gavin Lee. All rights reserved.
 * 
 */
package com.xuebing.algorithm.basis.search.binary;

public class IteratorFive {

	public static int extentionOneBinarySearch(int key, int[] dataSet) {
        int low = -1;
        int high = dataSet.length;
        int mid;
        while (low + 1 != high) {
			mid = low + (high - low) / 2;
            if (dataSet[mid] < key) {
                low = mid;
            } else {
                high = mid;
            }
        }
        if (high >= dataSet.length || dataSet[high] != key) {
            high = -1;
        }
        return high;
    }

}
