/**
 * IteratorFiveTest.java   2013-5-17 上午7:51:26 by gavin 
 *
 * Copyright (c) 2000 - 2013 Gavin Lee. All rights reserved.
 * 
 */
package com.xuebing.algorithm.basis.search.binary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.xuebing.algorithm.utils.ArrayUtil;

public class IteratorFiveTest {

    @After
    public void tearDown() throws Exception {
		assertTrue(true);
    }

    @Test
	public void testExtentionOneBinarySearch() {
        int[] dataSet = ArrayUtil.createArray(10);
        long starMTime = System.currentTimeMillis();
        long starNTime = System.nanoTime();
		int index = IteratorFive.extentionOneBinarySearch(9, dataSet);
        long useNTime = System.nanoTime() - starNTime;
        long useMTime = System.currentTimeMillis() - starMTime;
        System.out.println("BetterBinarySearch use time : " + useNTime
                + "nano");
        System.out.println("BetterBinarySearch use time : " + useMTime
                + "Millis");
        System.out.println("Find data index:" + index);
    }

	@Test
	public void testExtentionOneBinarySearch1() {
		int[] dataSet = ArrayUtil.createArray(10);
		int index = -2;
		for (int key : dataSet) {
			index = IteratorFive.extentionOneBinarySearch(key, dataSet);
			System.out.println("Find data index:" + index);
		}
	}

}
