package com.lc.lc1011;

import java.util.Arrays;

public class Solution {

    public int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt(), r = Arrays.stream(weights).sum();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (needTime(weights, mid) <= days) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }
        return l;
    }

    private int needTime(int[] weights, int mid) {
        int time = 1;
        int res = 0;
        for (int i = 0; i < weights.length; i++) {
            if (res + weights[i] <= mid) {
                res += weights[i];
            } else {
                res = weights[i];
                time++;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        Solution solution = new Solution();
        int i = solution.shipWithinDays(weights, days);
        System.out.println("结果1   " + i);

        int[] weights2 = {3, 2, 2, 4, 1, 4};
        int days2 = 3;
        Solution solution2 = new Solution();
        int time2 = solution2.shipWithinDays(weights2, days2);
        System.out.println("结果2   " + time2);
        int[] weights3 = {1, 2, 3, 1, 1};
        int days3 = 4;
        Solution solution3 = new Solution();
        int time3 = solution3.shipWithinDays(weights3, days3);
        System.out.println("结果3   " + time3);
    }
}
