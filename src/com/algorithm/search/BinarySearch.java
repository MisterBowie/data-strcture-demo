package com.algorithm.search;

import com.study.utils.ArrayGenerator;

/**
 * 二分查找法
 */
public class BinarySearch {
    private BinarySearch() {
    }

    public static <E extends Comparable<E>> int search(E[] data, E target) {
        return search(data, 0, data.length - 1, target);
    }

    private static <E extends Comparable<E>> int search(E[] data, int l, int r, E target) {
        if (l > r) return -1;
        int mid = l + (r - l) / 2;
        if (data[mid].compareTo(target) == 0) {
            return mid;
        }
        if (data[mid].compareTo(target) < 0) {
            return search(data, mid + 1, r, target);
        }
        return search(data, l, mid - 1, target);
    }

    public static void main(String[] args) {
        Integer[] integers = ArrayGenerator.generateRandomArray(6, 6);
        int search = BinarySearch.search(integers, 5);
        System.out.println(search);
    }
}
