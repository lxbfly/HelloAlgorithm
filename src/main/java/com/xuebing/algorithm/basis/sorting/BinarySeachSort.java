package com.xuebing.algorithm.basis.sorting;

import com.xuebing.algorithm.utils.ArrayUtil;

public class BinarySeachSort {

	public static int[] firstIteration(int[] dataSet) {
		int len = dataSet.length - 1;
		int mid = 0, low = 0, high = 0, key =0;
		for (int i = 1; i <= len; i++) {
			key = dataSet[i];
			low = 0;
			high = i-1;
			while (low <= high) {
				mid = low + (high - low) / 2;
				if (key > dataSet[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			for (int j = i - 1; j >= low; j--) {
				dataSet[j + 1] = dataSet[j];
				// dataSet[low] = key;
				// this is a error on Data Structure book, change followed:
				dataSet[j] = key;
			}
		}
		return dataSet;
	}

	public static void main(String[] args) {
		int[] dataSet = ArrayUtil.createRandomDisorderArray(5);
		int[] result = firstIteration(dataSet);
		for (int data : result) {
			System.out.print(data + " , ");
		}
	}

}
