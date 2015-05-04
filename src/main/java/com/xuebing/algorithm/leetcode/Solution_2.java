package com.xuebing.algorithm.leetcode;

/**
 * Add Two Numbers
 * 
 * @ClassName Solution_2
 * @Description <p>计算大数相加，以对象结点的方式</p> <p>You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it
 * as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 </p>
 * 
 * @author gordon.li coderxb@163.com
 * @date 2015年4月24日 下午3:58:59
 */
public class Solution_2 {

    private StringBuilder result = new StringBuilder();

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), preLN = result;
        if (l1 == null && l2 == null)
            return result;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        int val1, val2, sum, carry = 0, mod = 0;
        while (l1 != null || l2 != null) {
            sum = 0;
            val1 = 0;
            val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            sum = val1 + val2 + carry;
            mod = sum % 10;
            carry = sum / 10;
            preLN.next = new ListNode(mod);
            if (carry > 0)
                preLN.next.next = new ListNode(carry);
            preLN = preLN.next;
        }
        return result.next;
    }

    public void printListNodeValue(ListNode ln) {
        if (ln == null) {
            return;
        }
        if (ln.next != null) {
            System.out.print(ln.val + " -> ");
            printListNodeValue(ln.next);
        } else {
            System.out.print(ln.val);
        }
    }


    public String getListNodeValueString(ListNode ln) {
        if (ln != null) {
            result.append(ln.val);
            getListNodeValueString(ln.next);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode temp = new ListNode(4);
        l1.next = temp;
        temp.next = new ListNode(3);

        ListNode l2 = new ListNode(9);
        ListNode tmp = new ListNode(6);
        l2.next = tmp;
        tmp.next = new ListNode(4);

        Solution_2 atn = new Solution_2();
        ListNode result = atn.addTwoNumbers(l1, l2);
        atn.printListNodeValue(result);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

