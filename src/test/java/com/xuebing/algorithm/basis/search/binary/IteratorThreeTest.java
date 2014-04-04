/**
 * IteratorThreeTest.java   2013-5-16 下午11:12:20 by gavin 
 *
 * Copyright (c) 2000 - 2013 Gavin Lee. All rights reserved.
 * 
 */
package com.xuebing.algorithm.basis.search.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xuebing.algorithm.utils.ArrayUtil;

public class IteratorThreeTest {

    @Test
    public void testRecusionBinarySearch() {
        int result = -1;
		// int[] dataSet = ArrayUtil.createRandomOrderArray(100000000);
		int[] dataSet = ArrayUtil.createRandomOrderArray(1000);
        for (int i = 0; i < dataSet.length; i++) {
            result = IteratorThree.recusionBinarySearch(dataSet, dataSet[i], 0, dataSet.length-1);
            System.out.println("Search Result : " + result);
        }
		assertTrue(true);
    }
    
    @Test
    public void testRecusionBinarySearch1() {
		int[] dataSet = ArrayUtil.createRandomOrderArray(10000);
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
    }

}
