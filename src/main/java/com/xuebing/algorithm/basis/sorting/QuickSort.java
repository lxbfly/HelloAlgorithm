package com.xuebing.algorithm.basis.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = generateRendomArray(10);
		System.out.println("After sort, record information as below :");
		getQuickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	private static int[] generateRendomArray(Integer num) {
		if(num == null) {
			throw new NullPointerException();
		}
		if(num < 0) {
			throw new IllegalArgumentException("The Number is not lessthan 0.");
		}
		int[] arr = new int[num];
		for(int i=0; i< num; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println("Original Array Data as below : ");
		for(int data : arr) {
			System.out.print(data + "  ");
		}
		System.out.println();
		System.out.println("-------------------");
		return arr;
	}


	public static void getQuickSort(int[] arr, int low, int high) {
		if(low >= high) {
			return;
		}

		int first = low;
		int last = high;
		int pivotKey = arr[first];
		
		while(first<last) {
			while(first<last && arr[last]>=pivotKey) {
				--last;
			}
			// 将比第一个小的移到低端
			arr[first] = arr[last];

			while(first<last && arr[first]<=pivotKey) {
				++first;
			}
			//将比第一个大的移到高端
			arr[last] = arr[first];
		}
		arr[first] = pivotKey;
		getQuickSort(arr, low, first-1);
		getQuickSort(arr, last+1, high);		
	}

}
