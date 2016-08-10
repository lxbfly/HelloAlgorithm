package com.xuebing.algorithm.leetcode;

import java.util.Arrays;

/**
 * Median of Two Sorted Arrays
 *
 * @ClassName Solution_4
 * @Description There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * @author xuebing.li coderxb@163.com
 * @date 2016年8月1日 下午21:11
 */
public class Solution_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if(len1 == 0 && len2 == 0)  return 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0, k=0, len3 = len1 + len2;
        int[] temp = new int[len3];
        for(k=0; k < len1 + len2; k++){
            if(i < len1 && j < len2){
                if(nums1[i] < nums2[j])  {temp[k] = nums1[i]; i++;}
                else {temp[k] = nums2[j]; j++;}
            }else{
                if(i < len1) {temp[k] = nums1[i]; i++;}
                if(j < len2) {temp[k] = nums2[j]; j++;}
            }
        }
        return len3%2 == 0? (temp[len3/2 -1] + temp[len3/2])/2.0 : temp[len3/2];
    }


    public static void main(String [] args) {
        Solution_4 sn = new Solution_4();
        int[] num1 = {2,3,5,6,7,8};
        int[] num2 = {9,12,24};
        double res = sn.findMedianSortedArrays(num1, num2);

        System.out.print("result = " + res);
    }

}
