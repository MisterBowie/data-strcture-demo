package com.algorithm.search.bst;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }
        System.out.println("最小值");
        System.out.println(bst.miniNum().e);
        System.out.println("最大值");
        System.out.println(bst.maxNum().e);
    }
}
