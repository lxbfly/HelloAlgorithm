package com.xuebing.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * 
 * @ClassName Solution_1
 * @Description <p>Given an array of integers, find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must
 * be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2 </p>
 * 
 * @author gordon.li coderxb@163.com
 * @date 2015年4月24日 下午3:59:40
 */
public class Solution_1 {

    public static int[] twoSumForSimple(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = j + 1;
                    result[1] = i + 1;
                }
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(target - nums[i], i);
            }
            if (!map.containsKey(nums[i])) {
                continue;
            }
            if (map.get(nums[i]) != i) {
                result[0] = map.get(nums[i]) + 1;
                result[1] = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Input: numbers = " + Arrays.toString(nums) + ", target = " + target);
        long beginTime = System.nanoTime();
        int[] backRes = twoSum(nums, target);
        long sumTime = System.nanoTime() - beginTime;
        System.out.println("Output: index1 = " + backRes[0] + ", index2 = " + backRes[1]);
        System.out.println("The proccess Runtime: " + sumTime);

        System.out.println("Input: numbers = " + Arrays.toString(nums) + ", target = " + target);
        long beginTime1 = System.nanoTime();
        int[] backRes1 = twoSumForSimple(nums, target);
        long sumTime1 = System.nanoTime() - beginTime1;
        System.out.println("Output: index1 = " + backRes1[0] + ", index2 = " + backRes1[1]);
        System.out.println("The proccess Runtime: " + sumTime1);
    }
}
