package com.xuebing.algorithm.basis.search.binary;

import com.xuebing.algorithm.utils.ArrayUtil;

public class IteratorTwo {

	public static int binarySearchDeathLoop(int[] dataSet, int key) {
		int low = 0;
		int high = dataSet.length - 1;
		int mid;
		while (low < high) {
			mid = (low + high) / 2;
			if (key < dataSet[mid]) {
				high = mid;
			} else if (key > dataSet[mid]) {
				low = mid;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static int binarySearchDeathLoopCorrect(int[] dataSet, int key) {
		int low = 0;
		int high = dataSet.length;
		int mid;
		while (low < high) {
			mid = (low + high) / 2;
			if (key < dataSet[mid]) {
				high = mid;
			} else if (key > dataSet[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] dataSet = ArrayUtil.createArray(10);
		int key = 11;
		int result = IteratorTwo.binarySearchDeathLoop(dataSet, key);
		System.out.println("Result is = " + result);
	}
}
