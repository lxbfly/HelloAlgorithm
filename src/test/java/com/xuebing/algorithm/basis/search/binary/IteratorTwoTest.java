package com.xuebing.algorithm.basis.search.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xuebing.algorithm.utils.ArrayUtil;

public class IteratorTwoTest {

	@Test
	public void testBinarySearchDeathLoop() {
		int result = -1;
		int[] dataSet = ArrayUtil.createArray(10);
		// int[] dataSet = ArrayUtil.createRandomOrderArray(10);
		for (int i = 0; i < dataSet.length; i++) {
			result = IteratorTwo.binarySearchDeathLoop(dataSet, dataSet[i]);
			System.out.println("Search Result : " + result);
		}
		assertTrue(true);
	}

	@Test
	public void testBinarySearchDeathLoopCorrect() {
		int result = -1;
		int[] dataSet = ArrayUtil.createArray(10);
		for (int i = 0; i < dataSet.length; i++) {
			result = IteratorTwo.binarySearchDeathLoopCorrect(dataSet,
					dataSet[i]);
			System.out.println("Search Result : " + result);
		}
	}

	@Test
	public void testBinarySearchBorderIssueForKey() {
		int result = -1;
		int key = 11;
		int[] dataSet = ArrayUtil.createArray(10);
		result = IteratorTwo.binarySearchDeathLoop(dataSet, key);
		// result = IteratorTwo.binarySearchDeathLoopCorrect(dataSet, key);
		System.out.println("Key = " + key + " Search Result : " + result);
	}
}
