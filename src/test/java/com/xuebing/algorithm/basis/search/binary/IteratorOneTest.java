package com.xuebing.algorithm.basis.search.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xuebing.algorithm.utils.ArrayUtil;

public class IteratorOneTest {


	@Test
	public void testBinarySearchBorderIssue() {
		int result = -1;
		int[] dataSet = ArrayUtil.createRandomOrderArray(10);
		for (int i = 0; i < dataSet.length; i++) {
			result = IteratorOne.binarySearchBorderIssue(dataSet, dataSet[i]);
			System.out.println("Search Result : " + result);
		}
		assertTrue(true);
	}

	@Test
	public void testBinarySearchBorderIssueCorrect() {
		int result = -1;
		int[] dataSet = ArrayUtil.createRandomOrderArray(10);
		for (int i = 0; i < dataSet.length; i++) {
			result = IteratorOne.binarySearchBorderIssueCorrect(dataSet,
					dataSet[i]);
			System.out.println("Search Result : " + result);
		}
	}

	@Test
	public void testBinarySearchBorderIssueForKey() {
		int result = -1;
		int key = 10;
		int[] dataSet = ArrayUtil.createRandomOrderArray(10);
		result = IteratorOne.binarySearchBorderIssue(dataSet, key);
		System.out.println("Key = " + key + " Search Result : " + result);
	}
}
