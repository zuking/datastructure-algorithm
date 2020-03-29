package com.zuking.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zuking on 2020/3/24.
 */
public class Test {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        //当前值
        int current = nums[0];
        //给数组重新赋值的下标
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (current != nums[i]) {
                current = nums[i];
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6};
        int j = removeDuplicates(nums);
        for (int i = 0; i < j; i++) {
            System.out.print("," + nums[i]);
        }
    }
}
