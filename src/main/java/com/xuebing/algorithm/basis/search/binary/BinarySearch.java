package com.xuebing.algorithm.basis.search.binary;

public class BinarySearch {
	/**
	 * Binary Search
	 * 
	 * @param dataSet
	 * @param key
	 * @return des的数组下标，没找到返回-1
	 */
	public static int binarySearch(int[] dataSet, int key) {
		int low = 0;
		int high = dataSet.length - 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (key == dataSet[middle]) {
				return middle;
			} else if (key < dataSet[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -1;
	}

	public int recusionBinarySearch(int[] array, int data, int beginIndex,
			int endIndex) {
		int midIndex = (beginIndex + endIndex) >>> 1;
		if (data < array[beginIndex] || data > array[endIndex]
				|| beginIndex > endIndex) {
			return -1;
		}
		if (data < array[midIndex]) {
			return recusionBinarySearch(array, data, beginIndex, midIndex - 1);
		} else if (data > array[midIndex]) {
			return recusionBinarySearch(array, data, midIndex + 1, endIndex);
		} else {
			return midIndex;
		}
	}

	/**
	 * @param array
	 *            int[]
	 * @param data
	 *            int
	 * @return return index value of data, if don't find it then return -1
	 */
	public int nonrecusionBinarySearch(int data, int[] dataSet) {
		int low = 0, high = dataSet.length - 1;
		if (data < dataSet[low] || data > dataSet[high] || low > high) {
			return -1;
		}
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (data < dataSet[mid]) {
				high = mid - 1;
			} else if (data > dataSet[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public int nonrecusionBinarySearch1(int data, int[] dataSet) {
		int low = 0, high = dataSet.length - 1;
		if (data < dataSet[low] || data > dataSet[high] || low > high) {
			return -1;
		}
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (data < dataSet[mid]) {
				high = mid;
			} else if (data > dataSet[mid]) {
				low = mid;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public int lessthenBinarySearch(int data, int[] dataSet) {
		int low = 0, high = dataSet.length - 1;
		if (data < dataSet[low] || data > dataSet[high] || low > high) {
			return -1;
		}
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (data < dataSet[mid]) {
				high = mid - 1;
			} else if (dataSet[mid] > data) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public int betterBinarySearch(int key, int[] dataSet) {
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
