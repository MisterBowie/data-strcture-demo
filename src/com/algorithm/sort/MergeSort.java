package com.algorithm.sort;

import com.study.utils.ArrayGenerator;
import com.study.utils.SortingHelper;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 归并排序法
 */
public class MergeSort {

    public static <E extends Comparable<E>> void sort(E[] data) {
        E[] temp = Arrays.copyOfRange(data, 0, data.length);
        mergeSort(data, 0, data.length - 1, temp);
    }

    public static <E extends Comparable<E>> void mergeSort(E[] data, int l, int r, E[] temp) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(data, l, mid, temp);
        mergeSort(data, mid + 1, r, temp);
        merge(data, l, mid, r, temp);
    }

        public static <E extends Comparable<E>> void merge(E[] data, int l, int mid, int r, E[] temp) {
        System.arraycopy(data, l, temp, l, r - l + 1);
        int j = mid + 1;
        int k = l;
        for (int i = l; i <= r; i++) {
            if (k > mid) {
                data[i] = temp[j];
                j++;
            } else if (j > r) {
                data[i] = temp[k];
                k++;
            } else if (temp[k].compareTo(temp[j]) <= 0) {
                data[i] = temp[k];
                k++;
            } else {
                data[i] = temp[j];
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int n = 5000000;
        Integer[] integers = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("MergeSort", integers);

    }

}
