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

    /**
     * 求比target大的最小值的索引
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upper(E[] data, E target) {
        int l = 0, r = data.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (data[mid].compareTo(target) <= 0) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    /**
     * ceil处理
     * 1，1，3，3，5，5，7，7
     * 查找5 如果存在元素，返回最大索引5 及第二个5所在的索引
     * 查找6 如果不存在，则返回upper的索引6，即第一个7所在的索引
     */
    public static <E extends Comparable<E>> int ceil(E[] data, E target) {
        int u = upper(data, target);
        if (u - 1 >= 0 && data[u - 1].compareTo(target) == 0) {
            return u - 1;
        }
        return u;
    }

    public static void main(String[] args) {
//普通二分法测试
//        Integer[] integers = ArrayGenerator.generateRandomArray(6, 6);
//        int search = BinarySearch.search(integers, 5);
//        System.out.println(search);
        //二分法upper问题
//        Integer[] integers = new Integer[]{1, 1, 3, 3, 5, 5};
//        for (int i = 0; i < 7; i++) {
//            System.out.println("当前值" + i + "求出的索引" + BinarySearch.upper(integers, i));
//        }

        //二分法ceil问题
        Integer[] integers = new Integer[]{1, 1, 3, 3, 5, 5};
        for (int i = 0; i < 7; i++) {
            System.out.println("当前值" + i + "求出的索引" + BinarySearch.ceil(integers, i));
        }
    }
}
