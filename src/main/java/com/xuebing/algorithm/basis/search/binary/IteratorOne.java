package com.xuebing.algorithm.basis.search.binary;

import com.xuebing.algorithm.utils.ArrayUtil;

public class IteratorOne {

	public static int binarySearchBorderIssue(int[] dataSet, int key) {
		int low = 0;
		int high = dataSet.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (key < dataSet[mid]) {
				high = mid - 1;
			} else if (key > dataSet[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static int binarySearchBorderIssueCorrect(int[] dataSet, int key) {
		int low = 0;
		int high = dataSet.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key < dataSet[mid]) {
				high = mid - 1;
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
		int result = IteratorOne.binarySearchBorderIssue(dataSet, key);
		System.out.println("Result is = " + result);
	}
}
