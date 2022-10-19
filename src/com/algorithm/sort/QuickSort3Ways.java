package com.algorithm.sort;

import com.study.utils.ArrayGenerator;
import com.study.utils.SortingHelper;

import java.util.Random;

/**
 * 三路路快速排序
 * 将待处理的数据分成三个区域且有三个索引指。
 * 分两个区，一个小于标定点一个大于标定点的。
 * [3,1,4,6,5,7,8]
 * l            r
 * ---j         k
 * 上面文字的两个索引指的是j,k,注意对应的索引
 * l-j 小于l  k-r大于l
 */
public class QuickSort3Ways {
    private static Random random = new Random();

    private QuickSort3Ways() {
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
        // p的范围为[l-r]
        int p = random.nextInt(r - l + 1) + l;
        swap(arr, l, p);
        int j = l + 1;
        int k = r;
        while (true) {
            while (j <= k && arr[j].compareTo(arr[l]) < 0) {
                j++;
            }
            while (k >= j && arr[k].compareTo(arr[l]) > 0) {
                k--;
            }
            if (j >= k) break;
            swap(arr, j, k);
            j++;
            k--;
        }
        swap(arr, l, k);
        return k;
    }

    private static <E extends Comparable<E>> void swap(E[] arr, int start, int end) {
        E t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;
    }

    public static void main(String[] args) {
        int n = 500000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("QuickSort2Ways", arr);
    }
}
