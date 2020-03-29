package com.zuking.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zuking on 2020/3/29.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] newarray = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    newarray[0] = nums[i];
                    newarray[1] = nums[j];
                    return newarray;
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumHaspMap(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};//返回数组下标
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 8, 11, 15};
        int[] newArray = twoSumHaspMap(nums, 9);
        System.out.print("[");
        for (int i = 0; i < newArray.length; i++) {
            String s = i == (newArray.length - 1) ? "" : ",";
            System.out.print(newArray[i] + s);
        }
        System.out.print("]");
    }
}
