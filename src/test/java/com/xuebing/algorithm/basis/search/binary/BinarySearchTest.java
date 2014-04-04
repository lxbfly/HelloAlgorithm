package com.xuebing.algorithm.basis.search.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xuebing.algorithm.utils.ArrayUtil;

public class BinarySearchTest {

	@Test
	public void testRecusionBinarySearch() {
		int[] dataSet = ArrayUtil.createArray(10000);
		BinarySearch sa = new BinarySearch();
		long starMTime = System.currentTimeMillis();
		long starNTime = System.nanoTime();
		int index = sa.recusionBinarySearch(dataSet, 9, 0, dataSet.length - 1);
		long useNTime = System.nanoTime() - starNTime;
		long useMTime = System.currentTimeMillis() - starMTime;
		System.out.println("RecusionBinarySearch use time : " + useNTime
				+ " nano");
		System.out.println("RecusionBinarySearch use time : " + useMTime
				+ " Millis");
		System.out.println("Find data index:" + index);
		assertTrue(true);
	}

	@Test
	public void testNonrecusionBinarySearch() {
		int[] dataSet = ArrayUtil.createArray(10000000);
		BinarySearch sa = new BinarySearch();
		long starMTime = System.currentTimeMillis();
		long starNTime = System.nanoTime();
		int index = sa.nonrecusionBinarySearch(9, dataSet);
		long useNTime = System.nanoTime() - starNTime;
		long useMTime = System.currentTimeMillis() - starMTime;
		System.out.println("NonrecusionBinarySearch use time : " + useNTime
				+ "nano");
		System.out.println("NonrecusionBinarySearch use time : " + useMTime
				+ "Millis");
		System.out.println("Find data index:" + index);
	}

	@Test
	public void testNonrecusionBinarySearch1() {
		int[] dataSet = ArrayUtil.createArray(100000);
		BinarySearch sa = new BinarySearch();
		long starMTime = System.currentTimeMillis();
		long starNTime = System.nanoTime();
		int index = sa.nonrecusionBinarySearch1(2, dataSet);
		long useNTime = System.nanoTime() - starNTime;
		long useMTime = System.currentTimeMillis() - starMTime;
		System.out.println("NonrecusionBinarySearch1 use time : " + useNTime
				+ "nano");
		System.out.println("NonrecusionBinarySearch1 use time : " + useMTime
				+ "Millis");
		System.out.println("Find data index:" + index);
	}
}
