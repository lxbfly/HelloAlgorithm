package com.xuebing.algorithm.utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
	public static int[] createArray(int initialCapacity) {
		int[] dataSet = new int[initialCapacity];
		for (int i = 0; i < initialCapacity; i++) {
			dataSet[i] = i + 2;
		}
		printArray(dataSet);
		return dataSet;
	}

	public static int[] createRandomDisorderArray(int initialCapacity) {
		int[] dataSet = new int[initialCapacity];
		Random r = new Random();
		for (int i = 0; i < initialCapacity; i++) {
			dataSet[i] = r.nextInt(initialCapacity);
		}
		if (dataSet.length < 100) {
			printArray(dataSet);
		}
		return dataSet;
	}

	public static int[] createRandomOrderArray(int initialCapacity) {
		int[] dataSet = new int[initialCapacity];
		Random r = new Random();
		for (int i = 0; i < initialCapacity; i++) {
			dataSet[i] = r.nextInt(initialCapacity);
		}
		Arrays.sort(dataSet);
		if (dataSet.length < 100) {
			printArray(dataSet);
		}
		return dataSet;
	}

	private static void printArray(int[] dataSet) {
		for (int data : dataSet) {
			System.out.print(data + "   ");
		}
		System.out.println();
	}

	public static void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
}
