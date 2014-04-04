package com.xuebing.algorithm.basis.search.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xuebing.algorithm.utils.ArrayUtil;

public class IteratorFourTest {
	@Test
	public void testBinarySearchFirstValue() {
		int[] dataSet = ArrayUtil.createRandomDisorderArray(20);
		int index = IteratorFour.binarySearchFirstValue(12, dataSet);
		System.out.println("Find data index:" + index);
		assertTrue(true);
	}

	@Test
	public void testExtentionTwoBinarySearch() {
		int[] dataSet = ArrayUtil.createArray(1001);
		long starMTime = System.currentTimeMillis();
		long starNTime = System.nanoTime();
		int index = IteratorFour.extentionTwoBinarySearch1(9, dataSet);
		long useNTime = System.nanoTime() - starNTime;
		long useMTime = System.currentTimeMillis() - starMTime;
		System.out
				.println("BetterBinarySearch use time : " + useNTime + "nano");
		System.out.println("BetterBinarySearch use time : " + useMTime
				+ "Millis");
		System.out.println("Find data index:" + index);
	}


	@Test
	public void test() {
		int[] dataSet = ArrayUtil.createArray(10);
		long starMTime = System.currentTimeMillis();
		long starNTime = System.nanoTime();
		int index = IteratorFour.extentionTwoBinarySearch1(9, dataSet);
		long useNTime = System.nanoTime() - starNTime;
		long useMTime = System.currentTimeMillis() - starMTime;
		System.out
				.println("BetterBinarySearch use time : " + useNTime + "nano");
		System.out.println("BetterBinarySearch use time : " + useMTime
				+ "Millis");
		System.out.println("Find data index:" + index);
	}

}
