package com.xuebing.algorithm.basis.sorting;

import com.xuebing.algorithm.utils.ArrayUtil;

public class BubbleSort {

	public static int[] firstIteration(int[] dataSet) {
		int len = dataSet.length - 1;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = len; j > i; j--) {
				if (dataSet[j] < dataSet[j - 1]) {
					temp = dataSet[j];
					dataSet[j] = dataSet[j - 1];
					dataSet[j - 1] = temp;
				}
				
			}
		}
		return dataSet;
	}

	/**
	 * @author lixuebing
	 * @param dataSet
	 * @see optimization method: add exchange flag, if exchange = true, then
	 *      continuous exce, otherwise stop loop
	 * @return
	 */
	public static int[] secordIteration(int[] dataSet) {
		int len = dataSet.length - 1;
		boolean exchange = false;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			exchange = false;
			for (int j = len; j > i; j--) {
				if (dataSet[j] < dataSet[j - 1]) {
					temp = dataSet[j];
					dataSet[j] = dataSet[j - 1];
					dataSet[j - 1] = temp;
					exchange = true;
				}
			}
			if(!exchange) {
				break;
			}
		}
		return dataSet;
	}

	public static void main(String[] args) {
		int[] dataSet = ArrayUtil.createRandomDisorderArray(6);
		// firstIteration(dataSet);
		secordIteration(dataSet);
		for (int data : dataSet) {
			System.out.print(data + " , ");
		}
	}

}