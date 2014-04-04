package com.xuebing.algorithm.basis.sorting;

import com.xuebing.algorithm.utils.ArrayUtil;

public class StraightInsertionSort {

	public static int[] firstIteration(int[] dataSet) {
		int len = dataSet.length - 1;
		int temp = 0;
		for (int i = 1; i <= len; i++) {
			for (int j = 0; j < i; j++) {
				if (dataSet[i] < dataSet[j]) {
					temp = dataSet[j];
					dataSet[j] = dataSet[i];
					dataSet[i] = temp;
				}
			}
		}
		return dataSet;
	}

	public static int[] secordIteration(int[] dataSet) {
		int len = dataSet.length - 1;
		int temp;
		for (int i = 1; i <= len; i++) {
			if (dataSet[i] < dataSet[i - 1]) {
				temp = dataSet[i];
				for (int j = i - 1; j >= 0 && dataSet[j] > temp; j--) {
					dataSet[j + 1] = dataSet[j];
					dataSet[j + 1] = temp;
				}
			}
		}
		return dataSet;
	}

	public static int[] thirdIterationForBadMethod(int a[], int n) {
		int i, j, k;
		for (i = 1; i < n; i++) {
			for (j = i - 1; j >= 0; j--)
				if (a[j] < a[i])
					break;

			if (j != i - 1) {
				int temp = a[i];
				for (k = i - 1; k > j; k--)
					a[k + 1] = a[k];
				a[k + 1] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] dataSet = ArrayUtil.createRandomDisorderArray(10);
		// firstIteration(dataSet);
		secordIteration(dataSet);
		// thirdIterationForBadMethod(dataSet, dataSet.length);
		for (int data : dataSet) {
			System.out.print(data + " , ");
		}
	}



}
