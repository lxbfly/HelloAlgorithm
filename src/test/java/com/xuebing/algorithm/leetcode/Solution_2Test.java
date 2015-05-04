/**
 * AddTwoNumbersTest.java   2015年5月4日 下午2:54:38 by gordon.li 
 *
 * Copyright (c) 2000 - 2015 gordon.Li. All rights reserved.
 * 
 */
package com.xuebing.algorithm.leetcode;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class Solution_2Test {

    private Solution_2 atn = null;

    @Before
    public void setUp() {
        atn = new Solution_2();
    }

    @Test
    public void testL1Null() {
        ListNode l2 = new ListNode(9);
        ListNode tmp = new ListNode(6);
        l2.next = tmp;
        tmp.next = new ListNode(4);

        ListNode result = atn.addTwoNumbers(null, l2);
        atn.printListNodeValue(result);
        String actual = atn.getListNodeValueString(result);
        assertEquals("964", actual);
    }

    @Test
    public void testL2Null() {
        ListNode l1 = new ListNode(9);
        ListNode temp = new ListNode(4);
        l1.next = temp;
        temp.next = new ListNode(3);

        ListNode result = atn.addTwoNumbers(l1, null);
        atn.printListNodeValue(result);

        String actual = atn.getListNodeValueString(result);
        assertEquals("943", actual);
    }

    @Test
    public void testAllNull() {
        ListNode result = atn.addTwoNumbers(null, null);
        atn.printListNodeValue(result);

        String actual = atn.getListNodeValueString(result);
        assertEquals("0", actual);
    }

    @Test
    public void testZero() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode result = atn.addTwoNumbers(l1, l2);
        atn.printListNodeValue(result);

        String actual = atn.getListNodeValueString(result);
        assertEquals("0", actual);
    }

    @Test
    public void testTwoFive() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        ListNode result = atn.addTwoNumbers(l1, l2);
        atn.printListNodeValue(result);

        String actual = atn.getListNodeValueString(result);
        assertEquals("01", actual);
    }

    @Test
    public void testNormal() {
        ListNode l1 = new ListNode(9);
        ListNode temp = new ListNode(4);
        l1.next = temp;
        temp.next = new ListNode(3);

        ListNode l2 = new ListNode(9);
        ListNode tmp = new ListNode(6);
        l2.next = tmp;
        tmp.next = new ListNode(4);
        ListNode result = atn.addTwoNumbers(l1, l2);
        atn.printListNodeValue(result);

        String actual = atn.getListNodeValueString(result);
        assertEquals("818", actual);
    }

    @Test
    public void testNormal1() {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(9);
        ListNode tmp = new ListNode(6);
        l2.next = tmp;
        tmp.next = new ListNode(4);
        ListNode result = atn.addTwoNumbers(l1, l2);
        atn.printListNodeValue(result);

        String actual = atn.getListNodeValueString(result);
        assertEquals("874", actual);
    }

    @Test
    public void testNormal2() {
        ListNode l1 = new ListNode(9);
        ListNode temp = new ListNode(8);
        l1.next = temp;
        temp.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        ListNode tmp = new ListNode(6);
        l2.next = tmp;
        tmp.next = new ListNode(4);
        ListNode result = atn.addTwoNumbers(l1, l2);
        atn.printListNodeValue(result);

        String actual = atn.getListNodeValueString(result);
        assertEquals("8541", actual);
    }
}
