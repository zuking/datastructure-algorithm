package com.zuking.leetcode;

/**
 * Created by zuking on 2020/3/29.
 */
public class LargestRectangleArea {
    public static int largestRectangleArea(int[] heights) {
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                area = Math.max(area, minHeight * (j - i + 1));
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 4, 5, 2, 4, 3, 9};
        System.out.println(largestRectangleArea(nums));
    }
}
