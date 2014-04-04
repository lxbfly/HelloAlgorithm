package com.xuebing.algorithm.basis.search.binary;

public class IteratorFour {

	public static int binarySearchFirstValue(int key, int[] dataSet) {
		if (dataSet.length == 0)
			return -1;
		int low = 0;
		int high = dataSet.length - 1;
		int last = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (dataSet[mid] == key) {
				last = mid;
				high = mid - 1;
			} else if (dataSet[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return last;
	}

	public static int extentionTwoBinarySearch(int key, int[] dataSet) {
		int i = 512;
		int low = -1;
		if (dataSet[511] < key)
			low = 1000 - 512;
		int nexti;
		while (i != 1) {
			nexti = i / 2;
			if (dataSet[low + nexti] < key) {
				low = low + nexti;
				i = nexti;
			} else {
				i = nexti;
			}
		}
		int p = low + 1;
		if(p>1000 || dataSet[p] != key) {
			p = -1;
		}
		return p;
	}

	public static int extentionTwoBinarySearch1(int key, int[] dataSet) {
		int i = 512;
		int low = -1;
		while (i != 1) {
			i = i / 2;
			if (dataSet[low + i] < key)
				low = low + 1;
		}
		int p = low + 1;
		if (p > 1000 || dataSet[p] != key) {
			p = -1;
		}
		return p;
	}
}