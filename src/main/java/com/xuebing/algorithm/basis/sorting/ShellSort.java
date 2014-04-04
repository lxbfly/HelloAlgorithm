package com.xuebing.algorithm.basis.sorting;

import com.xuebing.algorithm.utils.ArrayUtil;

public class ShellSort {

	public static int[] firstIteration(int[] dataSet) {
		int len = dataSet.length - 1;
		int d = len / 2;
		int j = 0;
		int temp = 0;
		while (d >= 1) {
			for (int i = d + 1; i <= len; i++) {
				temp = dataSet[i];
				j = i - d;
				while ((j > 0) && (temp < dataSet[j])) {
					dataSet[j + d] = dataSet[j];
					j = j - d;
				}
				dataSet[j + d] = temp;
			}
			d = d / 2;
		}
		return dataSet;
	}

	public static void main(String[] args) {
		int[] dataSet = ArrayUtil.createRandomDisorderArray(6);
		int[] result = firstIteration(dataSet);
		for (int data : result) {
			System.out.print(data + " , ");
		}
	}
}
