package com.ns.cp.leetcode;

import java.util.Scanner;

/*
https://leetcode.com/problems/running-sum-of-1d-array/
*/
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        System.out.println(runningSum(new int[]{1, 2, 3, 4}));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
