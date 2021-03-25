package com.hwz.mysbhhh.leetcode;

import java.util.TreeMap;

/**
 * @Auther: hwz
 * @Date: 2021/03/24/15:33
 * @Description: 给你一个整数数组 nums ，数组中共有 n 个整数。132 模式的子序列 由三个整数 nums[i]、nums[j] 和 nums[k] 组成，并同时满足：i < j < k 和 nums[i] <
 *               nums[k] < nums[j] 。
 *               <p>
 *               如果 nums 中存在 132 模式的子序列 ，返回 true ；否则，返回 false
 */
public class NumPattern {

    public static boolean solution(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        int leftMin = nums[0];
        // 右侧所有元素
        TreeMap<Integer, Integer> rightAll = new TreeMap<>();
        for (int k = 2; k < n; k++) {
            rightAll.put(nums[k], rightAll.getOrDefault(nums[k], 0) + 1);
        }
        for (int j = 1; j < n - 1; ++j) {
            if (leftMin < nums[j]) {
                Integer next = rightAll.ceilingKey(leftMin + 1);
                if (next != null && next < nums[j]) {
                    return true;
                }
            }
            leftMin = Math.min(leftMin, nums[j]);
            rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);
            if (rightAll.get(nums[j + 1]) == 0) {
                rightAll.remove(nums[j + 1]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 2;
        System.out.println(solution(nums));
    }
}
