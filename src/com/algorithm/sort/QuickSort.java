package com.algorithm.sort;

import com.study.utils.ArrayGenerator;
import com.study.utils.SortingHelper;

/**
 * 快速排序
 */
public class QuickSort {

    private QuickSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        if (l >= r) return;
        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    /**
     * 对数据进行分区，并找到分区p的位置
     *
     * @return
     */
    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r) {
        int j = l;
        for (int i = l; i <= r; i++) {
            if (arr[l].compareTo(arr[i]) > 0) {
                j++;
                swap(arr, j, i);
            }
        }
        swap(arr, l, j);
        return j;
    }

    private static <E extends Comparable<E>> void swap(E[] arr, int start, int end) {
        E t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;
    }

    public static void main(String[] args) {
        int n = 1000000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("QuickSort", arr);
    }
}
