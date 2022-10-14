package com.study.utils;

import com.algorithm.sort.MergeSort;
import com.algorithm.sort.QuickSort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortingHelper {

    private SortingHelper() {
    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {

        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortname, E[] arr) {
        long startTime = System.nanoTime();
        if (sortname.equals("MergeSort"))
            MergeSort.sort(arr);
        if (sortname.equals("QuickSort"))
            QuickSort.sort(arr);
//        else if(sortname.equals("InsertionSort"))
//            InsertionSort.sort(arr);
//        else if(sortname.equals("InsertionSort2"))
//            InsertionSort.sort2(arr);
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        if (!SortingHelper.isSorted(arr)) {
            System.out.println("排序结果"+Arrays.stream(arr).map(String::valueOf).collect(Collectors.joining(",")));
            throw new RuntimeException(sortname + " failed");
        }
        System.out.println(String.format("%s , n = %d : %f s", sortname, arr.length, time));
    }
}