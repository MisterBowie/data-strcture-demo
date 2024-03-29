package com.lc.lc875;

import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        while (l < r) {
            int mid = l + (r - l) / 2;// 注意这里有上边界和下边界的问题
            if (eatingTime(piles, mid) <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private int eatingTime(int[] piles, int mid) {
        int res = 0;
        for (int pile : piles) {
            res += pile / mid + (pile % mid > 0 ? 1 : 0);
        }
        return res;
    }
}
