package com.study.recursive;

public class Sum {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int left) {
        if (left == arr.length) {
            return 0;
        }
        int sum = sum(arr, left + 1);
        int res = arr[left] + sum;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        final int sum = sum(arr);
        System.out.println("结果： " + sum);
    }
}
